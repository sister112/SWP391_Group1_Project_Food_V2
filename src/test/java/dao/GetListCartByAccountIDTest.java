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
public class GetListCartByAccountIDTest {
    CartDAO cdao;
    
    public GetListCartByAccountIDTest() {
        cdao = new CartDAO();
    }

    @Test
    public void testGetListCartByAccountID() {
        assertNotNull(cdao.getListCartByAccountID(5));
    }
    
    @Test
    public void testGetListCartByAccountID1() {
        assertNotNull(cdao.getListCartByAccountID(4));
    }
    
    @Test
    public void testGetListCartByAccountID2() {
        assertEquals(cdao.getListCartByAccountID(5).get(0).getProductName(), "Bún Bò Huế");
    }
    
    @Test
    public void testGetListCartByAccountID3() {
        assertNotEquals(cdao.getListCartByAccountID(5).get(1).getProductName(), "Bún Bò Huế");
    }
    
}
