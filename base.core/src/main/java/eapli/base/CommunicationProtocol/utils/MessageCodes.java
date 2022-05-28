package eapli.base.CommunicationProtocol.utils;

public enum MessageCodes {

    COMTEST(0),DISCONN(1), ACK(2),SUCCESS(3),GETPRODUCTS(4),ACTIVATEAUTOPREPAREORDER(5),
    DEACTIVATEAUTOPREPAREORDER(6),SAVESHOPPINGCART(7),CONNCLIBO(8), CONNCLIAGVDT(9),TURNONAGVDT(10),ERROR(11);


    public int code;
    private MessageCodes(int code){
        this.code = code;
    }

    public static MessageCodes getEnum(int code){
        for(MessageCodes messageCodes : MessageCodes.values()){
            if(messageCodes.getCode() == code) {
                return messageCodes;
            }
        }
        return null;
    }
    public int getCode() {
        return code;
    }
}
