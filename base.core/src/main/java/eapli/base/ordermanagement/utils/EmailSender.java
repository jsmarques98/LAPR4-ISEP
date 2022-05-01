package eapli.base.ordermanagement.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmailSender {

    public EmailSender() {

    }

    public boolean sendEmail(String customerEmail, String subject, String message) {
        try {
            File myObj = new File("base.core/src/main/resources/email/"+customerEmail + ".txt");
            myObj.createNewFile();
            FileWriter myWriter = new FileWriter(customerEmail + ".txt");
            myWriter.write("BY: SPOMS \nSUBJECT: " + subject + "\nMESSAGE:" + message);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
