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
public class GetListProductTest {
    ProductDAO pdao;
    
    public GetListProductTest() {
        pdao = new ProductDAO();
    }

    @Test
    public void testGetListProduct() {
        assertNotNull(pdao.getListProduct());
    }

    @Test
    public void testGetListProduct1() {
        assertEquals(pdao.getListProduct().get(0).getProductName(),"Phở Hà Nội");
    }
    
    @Test
    public void testGetListProduct2() {
        assertNotEquals(pdao.getListProduct().get(3).getProductName(),"Phở Hà Nội");
    }
}
