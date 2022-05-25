package eapli.base.CommunicationProtocol.utils;

import java.io.*;
import java.net.Socket;

public class DataHandler {
    private final Integer VERSION = 1;
    private final int BUFFER_SIZE = 65535;
    private final Socket s;

    public DataHandler(Socket s){
        this.s = s;
    }

    public void sendData(byte[] data, MessageCodes messageCode) throws IOException {
        byte[] buffer = new byte[data.length+4];

        buffer[0] = VERSION.byteValue();
        buffer[1] = (byte)messageCode.getCode();
        buffer[2] = (byte) (data.length & 0xFF);
        buffer[3] = (byte) ((data.length>>8) & 0xFF);

        System.arraycopy(data,0,buffer,4, data.length);
        
        
        ObjectOutputStream sOut = new ObjectOutputStream(s.getOutputStream());
        TCPData tcpData = new TCPData(buffer);
        sOut.writeObject(tcpData);
        sOut.flush();
    }

    public TCPData readData() throws IOException {
        ObjectInputStream sIn = new ObjectInputStream(s.getInputStream());
        TCPData data = null ;
        try {
            data = (TCPData)sIn.readObject();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

}
