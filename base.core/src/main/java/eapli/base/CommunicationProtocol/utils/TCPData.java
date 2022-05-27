package eapli.base.CommunicationProtocol.utils;

import java.io.Serializable;
import java.util.Arrays;

public class TCPData implements Serializable {
    private byte[] data;

    public TCPData(byte[] data){
        this.data = data;
    }

    public byte[] messageData(){
        int start = 4;
        int end = dataSize()+4;
        return Arrays.copyOfRange(data, start, end);
    }

    public int messageCode(){
        return data[1];
    }

    public int dataSize(){
        return (int)data[2] + 256 * (int)data[3];
    }






}
