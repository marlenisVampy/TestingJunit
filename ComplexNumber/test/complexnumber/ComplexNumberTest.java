/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumber;

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
public class ComplexNumberTest {
    
        private ComplexNumber cUnoDos;
    private ComplexNumber cDosUno;
    private ComplexNumber cIguales;
     private ComplexNumber resultado;

    public ComplexNumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        cUnoDos= new ComplexNumber (1,2);
        cDosUno = new ComplexNumber (2,1);
        cIguales = new ComplexNumber (3,3);

    }
    
    @After
    public void tearDown() {
         cUnoDos= null;
        cDosUno = null;
        cIguales = null;
    }

    /**
     * Test of getReal method, of class ComplexNumber.
     */
    @Test
    public void testGetReal() {
        System.out.println("getReal");
        double expResult = 1.0;
        double result = cUnoDos.getReal();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of getImaginary method, of class ComplexNumber.
     */
    @Test
    public void testGetImaginary() {
        System.out.println("getImaginary");
        double expResult = 2.0;
        double result = cUnoDos.getImaginary();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of add method, of class ComplexNumber.
     */
  
    @Test
    public void testAdd() {
        System.out.println("add");
        
        ComplexNumber expResult =cDosUno.add(cUnoDos);
        assertEquals(expResult, cIguales);
        
    }

    /**
     * Test of multiply method, of class ComplexNumber.
     */
   /*
    @Test
    public void testMultiply() {
        System.out.println("multiply");
       ComplexNumber c = null;
        ComplexNumber instance = null;
        ComplexNumber expResult = null;
        ComplexNumber result = instance.multiply(c);
        assertEquals(expResult, result);
   
    }*/

    /**
     * Test of equals method, of class ComplexNumber.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        /*Object anObject = null;
        ComplexNumber instance = null;*/
        boolean expResult = false;
        boolean result = cIguales.equals(cDosUno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
