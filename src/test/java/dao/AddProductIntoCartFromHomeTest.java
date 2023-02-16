/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NghiaHHCE160343@fpt.edu.vn
 */
public class AddProductIntoCartFromHomeTest {
    CartDAO cdao;
    
    public AddProductIntoCartFromHomeTest() {
        cdao = new CartDAO();
    }

    @Test
    public void testAddProductIntoCartFromHome() {
        assertTrue(cdao.addProductIntoCartFromHome(5, 1));
    }
    
}
