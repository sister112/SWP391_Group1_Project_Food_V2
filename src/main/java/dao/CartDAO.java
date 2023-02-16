/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author NghiaHHCE160343@fpt.edu.vn
 */
public class CartDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean addProductIntoCartFromHome(int accountID, int productID) {
        String query = "INSERT INTO [CART] VALUES (?,?,?)";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, 1);
            ps.setInt(2, productID);
            ps.setInt(3, accountID);
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }

    public boolean isProductExistInCart(int accountID, int productID) {
        String query = "SELECT CartQuantity FROM [CART] WHERE AccountID = ? AND ProductID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, accountID);
            ps.setInt(2, productID);
            rs = ps.executeQuery();
            while (rs.next()) {
                if (rs.getInt(1) >= 1) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }

    public boolean updateQuantityProductInCart(int productQuantity, int accountID, int productID) {
        String query = "UPDATE CART\n"
                + "SET CartQuantity = ?\n"
                + "WHERE AccountID = ? AND ProductID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, productQuantity);
            ps.setInt(2, accountID);
            ps.setInt(3, productID);
            if (ps.executeUpdate() == 1) {
                return true;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }

    public int getQuannityProductInCart(int accountID, int productID) {
        String query = "SELECT CartQuantity FROM [CART] WHERE AccountID = ? AND ProductID = ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, accountID);
            ps.setInt(2, productID);
            rs = ps.executeQuery();
            int quantity = 0;
            while (rs.next()) {
                quantity = rs.getInt(1);
            }
            return quantity;
        } catch (Exception e) {
            e.getMessage();
        }
        return 0;
    }
}
