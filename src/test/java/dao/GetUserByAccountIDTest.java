/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package dao;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tran Thi Ngoc Hieu CE161025
 */
public class GetUserByAccountIDTest {
    UserDAO udao;
    
    public GetUserByAccountIDTest() {
        udao = new UserDAO();
    }

    @Test
    public void testGetUserByAccountID() {
        assertNotNull(udao.getUserByAccountID(5));
    }
    
     @Test
    public void testGetUserByAccountID1() {
        assertNull(udao.getUserByAccountID(8));
    }
    
     @Test
    public void testGetUserByAccountID2() {
        assertEquals(udao.getUserByAccountID(5).getAccountName(), "Lê Văn G1");
    }
}
