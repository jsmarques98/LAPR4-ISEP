#!/bin/bash
STOREPASS="forgotten"
for ENT in dashboard ; do
 rm -f ${ENT}.jks ${ENT}.pem
 echo -e "${ENT}\nDEI\nISEP\nPORTO\nPORTO\nPT\nyes" | keytool -genkey -v -alias ${ENT} -keyalg RSA -keysize 2048 \
    -validity 365 -keystore ${ENT}.jks -storepass ${STOREPASS}
 keytool -exportcert -alias ${ENT} -keystore ${ENT}.jks -storepass ${STOREPASS} -rfc -file ${ENT}.pem
done

for ENT in client1_agvmanager_J ; do
 echo "yes"|keytool -import -alias ${ENT} -keystore dashboard.jks -file ${ENT}.pem -storepass ${STOREPASS}
 echo "yes"|keytool -import -alias dashboard -keystore ${ENT}.jks -file dashboard.pem -storepass ${STOREPASS}
done