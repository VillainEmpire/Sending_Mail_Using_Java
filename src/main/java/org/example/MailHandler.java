package org.example;

import com.sun.activation.registries.MailcapFile;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MailHandler {
    void sendMail(){

        Properties sysProperties = System.getProperties();  // gives hashtable/hash-Map

        sysProperties.put(MailConstantData.Host,MailConstantData.HostServer);
        sysProperties.put(MailConstantData.portName,MailConstantData.port);
        sysProperties.put(MailConstantData.sslProperty,"true");
        sysProperties.put(MailConstantData.authParam,"true");

        Authenticator mailAuthentication = new MailAuthentication();

        Session mailSession = Session.getInstance(sysProperties,mailAuthentication);

        MimeMessage mailmessage = new MimeMessage(mailSession);

        try{
            mailmessage.setFrom(MailConstantData.senderEmail);
            mailmessage.setText("This mail is send by Vipin using send Mail java program which include session class, " +
                    "authenticator class, Message class and many things more.");
            mailmessage.setSubject("Send Mail using Java Program");

            Address recieverAddress = new InternetAddress(MailConstantData.recieverEmail);
            mailmessage.setRecipient(Message.RecipientType.TO,recieverAddress);

            Transport.send(mailmessage);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }






    }

}
