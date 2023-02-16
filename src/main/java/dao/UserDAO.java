/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Account;
import model.AccountStatus;
import model.User;

/**
 *
 * @author Tran Thi Ngoc Hieu CE161025
 */
public class UserDAO {

    Connection con; // connect to SQL server
    PreparedStatement ps; // move query from Netbeen to SQl
    ResultSet rs; // save result query
    // Method to get a user by their account ID

    public User getUserByAccountID(int accountID) {

        try {
            // SQL query to select the user associated with a given account ID
            String query = "SELECT * FROM [ACCOUNT] A JOIN [USER] U ON A.AccountID = U.AccountID WHERE A.AccountID = ?";
            con = new DBContext().getConnection(); // open connection to SQL
            ps = con.prepareStatement(query); // move query from Netbeen to SQl
            ps.setInt(1, accountID);
            // Execute the query and get the result set
            rs = ps.executeQuery();
            // Initialize a new user object
            User user = null;
            // Loop through the result set and create a new user object with the retrieved data
            while (rs.next()) {
                user = new User(
                        rs.getString(10),
                        rs.getInt(1),
                        rs.getString(2),
                        "",
                        AccountStatus.valueOf(rs.getString(4)),
                        rs.getString(5),
                        rs.getInt(7),
                        rs.getString(6),
                        0, ""
                );
            }
             // Return the user object
            return user;
        } catch (Exception e) {
            e.getMessage();
        }
         // If an exception is caught, return null
        return null;
    }
}
