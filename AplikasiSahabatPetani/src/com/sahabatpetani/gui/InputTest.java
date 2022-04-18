package com.sahabatpetani.gui;

import java.util.Scanner;

public class InputTest {
    //Scanner
    Scanner input = new Scanner(System.in);
    
    //Field (textfield representation)
    int id;
    String username,address,phone,fullname;

    public void register() {
        System.out.print("Id: ");
        id = input.nextInt();
        System.out.print("Username: ");
        username = input.next();
        System.out.print("Address: ");
        address = input.next();
        System.out.print("Phone: ");
        phone = input.next();
        System.out.print("Fullname: ");
        fullname = input.next();
    }
}
