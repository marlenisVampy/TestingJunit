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
public class ProductTest extends TestCase{

    private Product new_Prodt;
    
    public ProductTest(String testName) {
        super(testName);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    @Override
    public void setUp() throws Exception {
        
       new_Prodt = new Product("P001", "Plasma TV LG 32",
"Plasma TV with TDT Decod. and high resolution Screen",1000.99);
    }
    
    @After
    public void tearDown() throws Exception {
        //super.tearDown();
        new_Prodt = null;
    }

    /**
     * Test of getCode method, of class Product.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        String expResult = "P001";
        String result = new_Prodt.getCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of getTitle method, of class Product.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
       String expResult = "Plasma TV LG 32";
        String result = new_Prodt.getTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDescription method, of class Product.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "Plasma TV with TDT Decod. and high resolution Screen";
        String result = new_Prodt.getDescription();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        
        double expResult = 1000.99;
        double result = new_Prodt.getPrice();
        assertEquals(expResult, result, 0.0);
       }
    
}
