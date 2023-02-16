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
    Connection con = null; // connect to SQL server
    PreparedStatement ps = null; // move query from Netbeen to SQl
    ResultSet rs = null; // save result query
    
    /**
     * This function get list product in cart
     * 
     * Function get accountID from parameter then use query into database to get 
     * all product in table cart by accountID.
     * 
     * @param accountID Account ID of user
     * @return list product in cart of user
     */
    public ArrayList<Cart> getListCartByAccountID(int accountID) {
        try {
            String query = "SELECT C.*, P.ProductName, P.ProductLinkImage ,P.ProductPrice, P.ProductSalePercent FROM [CART] C JOIN [PRODUCT] P ON C.ProductID = P.ProductID \n" +
                            "WHERE AccountID = ?"; // query select form database
            con = new DBContext().getConnection(); // open conect database
            ps = con.prepareStatement(query); // set account ID into query
            ps.setInt(1, accountID); // set account ID into query
            rs = ps.executeQuery(); // execute query
            ArrayList<Cart> listCart = new ArrayList<>(); // create list product in cart
            while (rs.next()) {                
                listCart.add(new Cart(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8)));
                // add new item into list product in cart
            } // end while
            return listCart; // return list product in cart
        } catch (Exception e) {
            e.getMessage();
        } // end try catch
        return null; // return null if not product into cart
    }
    
}
