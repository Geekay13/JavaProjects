package com.infikart;

import java.util.Scanner;

public class InfikartApplication 
{
    public static void main( String[] args )
    {
        ClientMessagingSystem cms= new ClientMessagingSystem();
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter address");
        String address = scanner.next();
        System.out.println("please enter message");
        String message = scanner.next();
        
        cms.send(address, message);
    }
}
