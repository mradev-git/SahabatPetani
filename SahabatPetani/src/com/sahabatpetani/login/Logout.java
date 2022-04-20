package com.sahabatpetani.login;

import javax.swing.JFrame;

public class Logout {
    public static void logOut(JFrame currentFrame, LoginForm loginFrame){
        LoginSession.isLoggedIn = false;
        currentFrame.setVisible(false);
        loginFrame.setVisible(true);
    }
}
