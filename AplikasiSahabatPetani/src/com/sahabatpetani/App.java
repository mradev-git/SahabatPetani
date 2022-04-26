/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sahabatpetani;

import com.sahabatpetani.gui.InputTest;
import com.sahabatpetani.gui.aboutPage;
import com.sahabatpetani.gui.loginPage;
import com.sahabatpetani.login.LoginForm;

/**
 *
 * @author HP PAVILION
 */
public class App {
    public static void main(String[] args) {
        //run app
        loginPage log = new loginPage();
        log.setVisible(true);
        LoginForm test = new LoginForm();
        test.login();
    }
}
