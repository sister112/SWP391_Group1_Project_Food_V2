/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author NghiaHHCE160343@fpt.edu.vn
 */
public class Category {
    private String categoryID; // ID of the category
    private String categoryDescription; // Description of the category

    /**
     * Constructor default
     */
    public Category() {
    }

    /**
     * Constructor with parameter categoryID, categoryDesciption
     * @param categoryID ID of the category
     * @param categoryDesciption Description of the category
     */
    public Category(String categoryID, String categoryDesciption) {
        this.categoryID = categoryID;
        this.categoryDescription = categoryDesciption;
    }

    /**
     * Get ID of the category
     * @return string ID of the category
     */
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Set ID of the category
     * @param categoryID ID of the category
     */
    public void setCategoryID(String categoryID) {
        this.categoryID = categoryID;
    }

    /**
     * Get Description of the category
     * @return String Description of the category
     */
    public String getCategoryDesciption() {
        return categoryDescription;
    }

    /**
     * Set Description of the category
     * @param categoryDesciption Description of the category
     */
    public void setCategoryDesciption(String categoryDesciption) {
        this.categoryDescription = categoryDesciption;
    }
    
    
}
