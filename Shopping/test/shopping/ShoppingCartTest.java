/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class ShoppingCartTest extends TestCase{
      
    private ShoppingCart new_shop;
    private Product new_Prodt;
    
    public ShoppingCartTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        new_shop = new ShoppingCart();
        new_Prodt = new Product("P001", "Plasma TV LG 32",
"Plasma TV with TDT Decod. and high resolution Screen",1000.99);
        
        new_shop.addItem(new_Prodt);
      
    }
    
    @After
    public void tearDown()throws Exception {
        new_shop = null;
        new_Prodt = null;
    }

    /**
     * Test of getBalance method, of class ShoppingCart.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        double expResult = 1000.99;
        double result = new_shop.getBalance();
        assertEquals(expResult, result, 0.0);
      }

    /**
     * Test of addItem method, of class ShoppingCart.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        new_shop.addItem(new_Prodt);
        
    }

    /**
     * Test of removeItem method, of class ShoppingCart.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
        new_shop.removeItem(new_Prodt);
      
    }

    /**
     * Test of getItemCount method, of class ShoppingCart.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
       int expResult = 1;
        int result = new_shop.getItemCount();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of empty method, of class ShoppingCart.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        new_shop.empty();
        
    }
    
}
