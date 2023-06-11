package org.example;


public class Main {
    public static void main(String[] args) {
        MailHandler mail = new MailHandler();

        mail.sendMail();
        System.out.println("Mail is sending");

    }
}