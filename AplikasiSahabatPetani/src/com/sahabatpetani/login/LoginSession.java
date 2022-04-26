package com.sahabatpetani.login;

public class LoginSession {
    protected static int UID; //global user ID
    protected static String Username; //global username
    protected static String Usertype; //global usertype
    protected static boolean isLoggedIn = false; //check is user is logged in

    public static String getUsertype() {
        return Usertype;
    }
}
