package com.sahabatpetani.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class DBConnection {
    public static Connection getConnection() throws Exception{
        //DB url
        String dbRoot = "jdbc:mysql://";
        String hostName = "localhost/";
        String dbName = "sahabat_petani";
        String dbUrl = dbRoot+hostName+dbName;

        //Username and password DB
        String hostUsername = "root";
        String hostPassword = "";
        
        try {
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found!");
        }
        
        //Establish connection
        Connection myConn = (Connection)DriverManager.getConnection(dbUrl, hostUsername, hostPassword);
        return myConn;
    }
}
