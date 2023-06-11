package org.example;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthentication extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {

        return new PasswordAuthentication(MailConstantData.senderEmail,MailConstantData.Password);
    }

}
