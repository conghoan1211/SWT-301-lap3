/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fibonacii;

import fibonacci.Fibonacci;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class fibonacii_test {

    public fibonacii_test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testFibonacii() {
        Fibonacci fi = new Fibonacci();
        long result = fi.fiboRecursive("0");
        assertEquals(0, result);
    }

    @Test
    public void testFiboRecursiveWithOne() {
        Fibonacci fi = new Fibonacci();
        long result = fi.fiboRecursive("1");
        assertEquals(1, result);
    }

    @Test
    public void testFiboRecursiveWithFive() {
        Fibonacci fi = new Fibonacci();
        long result = fi.fiboRecursive("5");
        assertEquals(5, result);
    }

    @Test
    public void testFiboRecursiveWithLargeNumber() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(6765, fibonacci.fiboRecursive("20"));
    }

    @Test(expected = NumberFormatException.class)
    public void testFiboRecursiveWithInvalidInput1() {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fiboRecursive("abcdefg");
    }

     @Test(expected = NumberFormatException.class)
    public void testFiboRecursiveWithInvalidInput2() {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fiboRecursive("");
    }
    
         @Test(expected = NumberFormatException.class)
    public void testFiboRecursiveWithInvalidInput3() {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fiboRecursive(null);
    }
    
    @Test
    public void testFibonacci3() {
        Fibonacci fibonacci = new Fibonacci();

        // Test với số âm (kỳ vọng ném ra IllegalArgumentException)
        assertThrows(StackOverflowError.class, () -> {
            fibonacci.fiboRecursive("-3");
        });
    }
}
