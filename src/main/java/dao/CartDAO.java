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
     * /**
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
            String query = "SELECT C.*, P.ProductName, P.ProductLinkImage ,P.ProductPrice, P.ProductSalePercent FROM [CART] C JOIN [PRODUCT] P ON C.ProductID = P.ProductID \n"
                    + "WHERE AccountID = ?"; // query select form database
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

    /**
     * This function add product into cart from home page
     *
     * Function use accountID and productID to insert new cart with cart
     * quantity is 1
     *
     * @param accountID Account ID of user
     * @param productID ID of product
     * @return true if insert successful, false if can not insert
     */
    public boolean addProductIntoCartFromHome(int accountID, int productID) {
        String query = "INSERT INTO [CART] VALUES (?,?,?)"; // string query insert cart
        try {
            con = new DBContext().getConnection(); // open connect database
            ps = con.prepareStatement(query); // move query from Netbeen to SQl
            ps.setInt(1, 1); // set CartQuantity
            ps.setInt(2, productID); // set ProductID
            ps.setInt(3, accountID); // set AccountID
            if (ps.executeUpdate() == 1) {
                // if insert successfull to return true
                return true;
            } // end if ps.executeUpdate() == 1
        } catch (Exception e) {
            e.getMessage();
        } // end try catch
        return false; // if can not insert
    }

    /**
     * This function check product already exist in cart
     *
     * This function user accountID and productID to select cart quantity. If
     * quantity greater or equal 1 to product already exit in cart.
     *
     * @param accountID Account ID of user
     * @param productID ID of product
     * @return true if product exist, false if product not exist
     */
    public boolean isProductExistInCart(int accountID, int productID) {
        String query = "SELECT CartQuantity FROM [CART] WHERE AccountID = ? AND ProductID = ?";
        // String query select quanity of a product in cart
        try {
            con = new DBContext().getConnection(); // open connect database
            ps = con.prepareStatement(query); // move query to database
            ps.setInt(1, accountID); // set AccountID
            ps.setInt(2, productID); // set ProductID
            rs = ps.executeQuery(); // execute query
            while (rs.next()) {
                if (rs.getInt(1) >= 1) {
                    // check quantity greater or equals 1
                    return true; // return true if greater or equals 1
                } // end if rs.getInt(1) >= 1
            } // end while
        } catch (Exception e) {
            e.getMessage();
        } // end try catch
        return false; // return false if less 1
    }

    /**
     * This function update quantity of a product in cart
     *
     * This function use accountID and productID check and update
     * productQuantity follow accountID and productID. New quantity equals
     * productQuantity + old product quantity from function
     * getQuannityProductInCart
     *
     * @param productQuantity Quantity of a product in cart
     * @param accountID Account ID of user
     * @param productID ID of product
     * @return true if update successful, false if can not update
     */
    public boolean updateQuantityProductInCart(int productQuantity, int accountID, int productID) {
        String query = "UPDATE CART\n"
                + "SET CartQuantity = ?\n"
                + "WHERE AccountID = ? AND ProductID = ?"; // string query update cart
        productQuantity += getQuannityProductInCart(accountID, productID);
        try {
            con = new DBContext().getConnection(); // open connect database
            ps = con.prepareStatement(query); // move query to database
            ps.setInt(1, productQuantity); // set ProductQuantity
            ps.setInt(2, accountID); // set AccountID
            ps.setInt(3, productID); // set ProductID
            if (ps.executeUpdate() == 1) {
                // if update successfull to return true
                return true;
            } // end if ps.executeUpdate() == 1
        } catch (Exception e) {
            e.getMessage();
        } // end try catch
        return false; // reutrn false if can not update
    }

    /**
     * This function get quantity of a product in cart
     *
     * This function use accountID and productID to select quantity of a product
     * in cart
     *
     * @param accountID Account ID of user
     * @param productID ID of product
     * @return int quantity of a product in cart
     */
    public int getQuannityProductInCart(int accountID, int productID) {
        String query = "SELECT CartQuantity FROM [CART] WHERE AccountID = ? AND ProductID = ?";
        // string query select quantity of a product in cart
        try {
            con = new DBContext().getConnection(); // open connect database
            ps = con.prepareStatement(query); // move query to database
            ps.setInt(1, accountID); // set AccountID
            ps.setInt(2, productID); // set ProductID
            rs = ps.executeQuery(); // execute query
            int quantity = 0; // create quantity
            while (rs.next()) {
                quantity = rs.getInt(1);
            } // end while
            return quantity; // return quantity of a product in cart
        } catch (Exception e) {
            e.getMessage();
        } // end try catch
        return 0; // return 0 if can not select quantity of a product in cart
    }

}
