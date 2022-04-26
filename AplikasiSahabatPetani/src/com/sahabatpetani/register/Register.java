package com.sahabatpetani.register;

import java.sql.Connection;
import java.sql.SQLException;

import com.sahabatpetani.db.DBConnection;

public class Register {

    private static String userName, fullName, address, phone, email;
    private static int typeInt;

    //get type_id by int from string
    private static int getTypeInt(String userType) {
        int typeInt = 0;
        switch (userType) {
            case "petani":
                typeInt = 1;
                break;

            case "pengepul":
                typeInt = 2;
                break;

            case "pengecer":
                typeInt = 3;
                break;
        }
        return typeInt;
    }

    public static void registerUser(String userName, String fullName, String userType, String address, String phone, String email) {
        typeInt = getTypeInt(userType);

        //insert to database
        try {
            Connection conn = DBConnection.getConnection();

            String query = "";
            conn.createStatement().executeUpdate(query);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
