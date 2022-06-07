#!/bin/bash
STOREPASS="forgotten"
for ENT in orders_server_J client1_orders_J client2_orders_J client3_orders_J ; do
 rm -f ${ENT}.jks ${ENT}.pem
 echo -e "${ENT}\nDEI\nISEP\nPORTO\nPORTO\nPT\nyes" | keytool -genkey -v -alias ${ENT} -keyalg RSA -keysize 2048 \
	-validity 365 -keystore ${ENT}.jks -storepass ${STOREPASS}
 keytool -exportcert -alias ${ENT} -keystore ${ENT}.jks -storepass ${STOREPASS} -rfc -file ${ENT}.pem
done
####
echo "Creating trust relations"

for ENT in client1_orders_J client2_orders_J client3_orders_J; do
 echo "yes"|keytool -import -alias ${ENT} -keystore orders_server_J.jks -file ${ENT}.pem -storepass ${STOREPASS}
 echo "yes"|keytool -import -alias orders_server_J -keystore ${ENT}.jks -file orders_server_J.pem -storepass ${STOREPASS}
done
keytool -list -keystore orders_server_J.jks -storepass ${STOREPASS}
