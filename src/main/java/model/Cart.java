/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NghiaHHCE160343@fpt.edu.vn
 */
public class Cart {

    private int cartID; // ID of the cart
    private String cartQuantity; // Quantity of items in the cart
    private int productID; // ID of the product in the cart
    private int accountID; // ID of the account associated with the cart
    private String productName; // Name of product
    private String productLink; // Link image of product

    /**
     *
     * Constructs a new Cart object with default values.
     */
    public Cart() {
    }

    /**
     *
     * Constructs a new Cart object with specified values.
     *
     * @param cartID the ID of the cart.
     * @param cartQuantity the quantity of items in the cart.
     * @param productID the ID of the product in the cart.
     * @param accountID the ID of the account associated with the cart.
     */
    public Cart(int cartID, String cartQuantity, int productID, int accountID) {
        this.cartID = cartID;
        this.cartQuantity = cartQuantity;
        this.productID = productID;
        this.accountID = accountID;
    }

    /**
     *
     * Constructs a new Cart object with specified values.
     *
     * @param cartID the ID of the cart.
     * @param cartQuantity the quantity of items in the cart.
     * @param productID the ID of the product in the cart.
     * @param accountID the ID of the account associated with the cart.
     * @param productName Name of the product
     * @param productLink Link image of product
     */
    public Cart(int cartID, String cartQuantity, int productID, int accountID, String productName, String productLink) {
        this.cartID = cartID;
        this.cartQuantity = cartQuantity;
        this.productID = productID;
        this.accountID = accountID;
        this.productName = productName;
        this.productLink = productLink;
    }

    /**
     *
     * Get name of the product
     *
     * @return String name of the product
     */
    public String getProductName() {
        return productName;
    }

    /**
     *
     * Set name of the product
     *
     * @param productName name of the product
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    /**
     * Get link image of product
     * @return productLink link image of product
     */
    public String getProductLink() {
        return productLink;
    }

    /**
     * Set link image of product
     * @param productLink link image of product
     */
    public void setProductLink(String productLink) {
        this.productLink = productLink;
    }
    
    /**
     *
     * Gets the ID of the cart.
     *
     * @return the ID of the cart.
     */
    public int getCartID() {
        return cartID;
    }

    /**
     *
     * Sets the ID of the cart.
     *
     * @param cartID the ID of the cart.
     */
    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    /**
     *
     * Gets the quantity of items in the cart.
     *
     * @return the quantity of items in the cart.
     */
    public String getCartQuantity() {
        return cartQuantity;
    }

    /**
     *
     * Sets the quantity of items in the cart.
     *
     * @param cartQuantity the quantity of items in the cart.
     */
    public void setCartQuantity(String cartQuantity) {
        this.cartQuantity = cartQuantity;
    }

    /**
     *
     * Gets the ID of the product in the cart.
     *
     * @return the ID of the product in the cart.
     */
    public int getProductID() {
        return productID;
    }

    /**
     *
     * Sets the ID of the product in the cart.
     *
     * @param productID the ID of the product in the cart.
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     *
     * Gets the ID of the account associated with the cart.
     *
     * @return the ID of the account associated with the cart.
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     *
     * Sets the ID of the account associated with the cart.
     *
     * @param accountID the ID of the account associated with the cart.
     */
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

}
