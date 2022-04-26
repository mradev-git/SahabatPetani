package com.sahabatpetani.login;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.sahabatpetani.gui.InitFrame;

public class LoginForm extends JFrame {
    Scanner sc = new Scanner(System.in);
    Operation op = new Operation();
    
    //Field (textfield representation)
    int id;
    String username, password;

    public void login() {
        //InitFrame initFrame = new InitFrame();
        //Input
        System.out.print("username: ");
        username = sc.nextLine();
        System.out.print("password: ");
        password = sc.nextLine();

        //login operation
        if (op.isLogin(username, password, this)) {
            JOptionPane.showMessageDialog(this, "login berhasil");
            //initFrame.getFrame(LoginSession.Usertype).setVisible(true); //kurang visibilitas frame
            
        } else {
            JOptionPane.showMessageDialog(this, "login gagal");
        }
    }
}
