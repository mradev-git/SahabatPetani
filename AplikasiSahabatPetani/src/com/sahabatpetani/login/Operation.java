package com.sahabatpetani.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.sahabatpetani.db.DBConnection;

public class Operation {
    public static boolean isLogin(String username, String password, String userType, JFrame frame) {
        try {
            Connection conn = DBConnection.getConnection();
            String query = "SELECT user_id, type_id, user_fullname FROM `user` JOIN `login` ON user.username=login.username WHERE login.username = '"+username+"' AND login.password = '"+password+"'";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                LoginSession.UID = resultSet.getInt("user_id");
                LoginSession.Usertype = resultSet.getString("type_id");
                LoginSession.Nickname = resultSet.getString("user_fullname");

                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error: "+ e.getMessage());
        }
        return false;
    }
}
