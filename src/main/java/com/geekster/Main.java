package com.geekster;

public class Main {
    public static void main(String[] args){
        System.out.println("This application is supposed to send mails");
        HandleMail mailer =  new HandleMail();
        mailer.sendMail();

    }
}
