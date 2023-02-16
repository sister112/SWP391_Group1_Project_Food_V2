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
public class IsProductExistInCartTest {
    CartDAO cdao;
    
    public IsProductExistInCartTest() {
        cdao = new CartDAO();
    }

    @Test
    public void testIsProductExistInCart() {
        assertTrue(cdao.isProductExistInCart(5, 1));
    }
    
    @Test
    public void testIsProductExistInCart1() {
        assertFalse(cdao.isProductExistInCart(5, 3));
    }
    
}
