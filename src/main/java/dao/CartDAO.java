/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cart;

/**
 *
 * @author NghiaHHCE160343@fpt.edu.vn
 */
public class CartDAO {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public ArrayList<Cart> getListCartByAccountID(int accountID) {
        try {
            String query = "SELECT C.*, P.ProductName, P.ProductLinkImage FROM [CART] C JOIN [PRODUCT] P ON C.ProductID = P.ProductID \n" +
                            "WHERE AccountID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, accountID);
            rs = ps.executeQuery();
            ArrayList<Cart> listCart = new ArrayList<>();
            while (rs.next()) {                
                listCart.add(new Cart(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6)));
            }
            return listCart;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }
    
}
