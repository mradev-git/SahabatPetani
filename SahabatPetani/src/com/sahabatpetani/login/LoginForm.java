package com.sahabatpetani.login;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginForm extends JFrame {
    Scanner sc = new Scanner(System.in);
    Operation op = new Operation();
    
    //Field (textfield representation)
    int id;
    String username, password;

    public void login() {
        //Input
        System.out.print("username: ");
        username = sc.nextLine();
        System.out.print("password: ");
        password = sc.nextLine();

        //login operation
        if (op.isLogin(username, password, this)) {
            JOptionPane.showMessageDialog(this, "login berhasil");
        } else {
            JOptionPane.showMessageDialog(this, "login gagal");
        }
    }
}
