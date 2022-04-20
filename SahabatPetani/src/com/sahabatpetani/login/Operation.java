package com.sahabatpetani.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.sahabatpetani.db.DBConnection;

public class Operation {
    public static boolean isLogin(String username, String password, JFrame frame) {
        try {
            Connection conn = DBConnection.getConnection(); //connection

            //SELECT u.user_id, u.type_id,  u.username FROM `user` AS u JOIN `login` AS l ON u.username=l.username WHERE l.username = 'user1' AND l.password = 'user1'

            //query
            String query = "SELECT u.user_id, u.username, ut.type_name FROM `user` AS u JOIN `login` AS l ON u.username=l.username JOIN `user_type` AS ut ON u.type_id=ut.type_id WHERE l.username = '"+username+"' AND l.password = '"+password+"'";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            //fetch
            while(resultSet.next()){
                LoginSession.UID = resultSet.getInt("user_id");
                LoginSession.Username = resultSet.getString("username");
                LoginSession.Usertype = resultSet.getString("type_name");

                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error: "+ e.getMessage());
        }
        return false;
    }
}
