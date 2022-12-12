/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package junit.test.simple;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Az
 */
public class JUnitTestSimpleTest {
    
    JUnitTestSimple my;
    
    public JUnitTestSimpleTest() {
    }
    
    
    @BeforeEach
    public void setUp() {
        
        
          my = new JUnitTestSimple();
    }
    
    @AfterEach
    public void tearDown() {
        
                my = null;
    }

    /**
     * Test of main method, of class JUnitTestSimple.
     */
    @Test
    public void testMain() {
     int a=50 , b=60,c;
     c = my.add(a, b);
     assertEquals(110,c);
    // assertEquals(60,c);
    }
    
}
