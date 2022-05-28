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
        int high = data[3] >= 0 ? data[3] : 256 + data[3];
        int low = data[2] >= 0 ? data[2] : 256 + data[2];
        return (int)(low | (high << 8));
    }






}
