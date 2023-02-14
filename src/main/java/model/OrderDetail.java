/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NghiaHHCE160343@fpt.edu.vn
 */
public class OrderDetail {

    private int orderDetailID; // ID of the order detail
    private int orderQuantity; // Quantity of product in the order
    private int orderPrice; // Price of the product in the order
    private int productID; // ID of the product in the order
    private int orderID; // ID of the order associated with the order detail

    /**
     * Constructor default
     */
    public OrderDetail() {
    }

    /**
     * Constructor with parameter orderDetailID, orderQuantity, orderPrice,
     * productID, orderID
     *
     * @param orderDetailID ID of the order detail
     * @param orderQuantity Quantity of the order detail
     * @param orderPrice Price of the order detail
     * @param productID ID of the product
     * @param orderID ID of the order
     */
    public OrderDetail(int orderDetailID, int orderQuantity, int orderPrice, int productID, int orderID) {
        this.orderDetailID = orderDetailID;
        this.orderQuantity = orderQuantity;
        this.orderPrice = orderPrice;
        this.productID = productID;
        this.orderID = orderID;
    }

    /**
     * Get ID of the order detail
     *
     * @return int ID of the order detail
     */
    public int getOrderDetailID() {
        return orderDetailID;
    }

    /**
     * Set ID of the order detail
     *
     * @param orderDetailID ID of the order detail
     */
    public void setOrderDetailID(int orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    /**
     * Get Quantity of the order detail
     *
     * @return int Quantity of the order detail
     */
    public int getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Set Quantity of the order detail
     *
     * @param orderQuantity Quantity of the order detail
     */
    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    /**
     * Get Price of the order detail
     *
     * @return int Price of the order detail
     */
    public int getOrderPrice() {
        return orderPrice;
    }

    /**
     * Set Price of the order detail
     *
     * @param orderPrice Price of the order detail
     */
    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * Get ID of the product
     *
     * @return int ID of the product
     */
    public int getProductID() {
        return productID;
    }

    /**
     * Set ID of the product
     *
     * @param productID ID of the product
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }

    /**
     * Get ID of the Order
     *
     * @return int ID of the Order
     */
    public int getOrderID() {
        return orderID;
    }

    /**
     * Set ID of the Order
     *
     * @param orderID ID of the Order
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

}
