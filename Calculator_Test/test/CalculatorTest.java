/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import calculator.Calculator;
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
public class CalculatorTest {

    public CalculatorTest() {
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

    @Test
    public void testAdd1() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    public void testAdd2() {
        Calculator calculator = new Calculator();
        int result = calculator.add(-1, -2);
        assertEquals(-3, result);
    }

    @Test
    public void testAddIntMaxValue() {
        Calculator calculator = new Calculator();
        int intMaxValue = Integer.MAX_VALUE;

        // Thử gọi hàm add với hai số intMaxValue, kỳ vọng nó sẽ throw exception
        calculator.add(intMaxValue, intMaxValue);
    }

    @Test
    public void testAdd4() {
        Calculator calculator = new Calculator();
        int result = calculator.add(0, 0);
        assertEquals(0, result);
    }

    // sub functions
    @Test
    public void testSubtract1() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(7, 3);
        assertEquals(4, result);
    }

    @Test
    public void testSubtract2() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(-1, -2);
        assertEquals(1, result);
    }

    @Test
    public void testSubtractIntMinValue() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(Integer.MIN_VALUE, -2);
        assertEquals(-2147483646, result);
    }

    @Test
    public void testSubtract4() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(0, 0);
        assertEquals(0, result);
    }

    // multiply functions
    @Test
    public void testMultiply1() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 6);
        assertEquals(30, result);
    }

    @Test
    public void testMultiply2() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(-3, 4);
        assertEquals(-12, result);
    }

    @Test
    public void testMultiplyZero() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(7, 0);
        assertEquals(0, result);
    }

    // divide functions
    @Test
    public void testDivideLargeNumbers1() {
        Calculator calculator = new Calculator();
        int intMaxValue = Integer.MAX_VALUE;

        // Testing if the divide method throws an exception with a large numerator
        try {
            calculator.divide(intMaxValue, 0);
        } catch (Exception e) {
            assertEquals("Cannot divide by zero.", e.getMessage());
        }
    }

    @Test
    public void testDivideLargeNumbers2() {
        Calculator calculator = new Calculator();
        int intMaxValue = Integer.MAX_VALUE;

        // Testing if the divide method throws an exception with a large numerator
        try {
            calculator.divide(intMaxValue, Integer.MAX_VALUE);
        } catch (Exception e) {
            assertEquals("Result is too large or too small to represent as a double.", e.getMessage());
        }
    }

    @Test
    public void testDivide1() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 2);
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(8, 0);
        });
    }

    @Test
    public void testDivideNegativeNumbers() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(-15, -3);
        assertEquals(5.0, result, 0.0001);
    }

    // power functions
    @Test
    public void testPower() {
        Calculator calculator = new Calculator();
        double result = calculator.power(2, 3);
        assertEquals(8.0, result, 0.0001);
    }

    @Test
    public void testPowerZeroExponent() {
        Calculator calculator = new Calculator();
        double result = calculator.power(5, 0);
        assertEquals(1.0, result, 0.0001);
    }

    @Test
    public void testPowerNegativeExponent() {
        Calculator calculator = new Calculator();
        double result = calculator.power(3, -2);
        assertEquals(0.1111, result, 0.0001);
    }

    @Test
    public void testPowerLargeExponent() {
        Calculator calculator = new Calculator();
        double base = 2;
        double largeExponent = 100000;

        // Testing if the power method throws an exception with a large exponent
        assertThrows(ArithmeticException.class, () -> {
            calculator.power(base, largeExponent);
        });
    }

    // square functions
    @Test
    public void testSquareRoot() {
        Calculator calculator = new Calculator();
        double result = calculator.squareRoot(9);
        assertEquals(3.0, result, 0.0001);
    }

    @Test
    public void testSquareRootZero() {
        Calculator calculator = new Calculator();
        double result = calculator.squareRoot(0);
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testSquareRootNegativeNumber() {
        Calculator calculator = new Calculator();
        calculator.squareRoot(-4);
    }

    @Test
    public void testSquareRootFraction() {
        Calculator calculator = new Calculator();
        double result = calculator.squareRoot(0.25);
        assertEquals(0.5, result, 0.0001);
    }

    @Test
    public void testSquareRootLargeNumber() {
        Calculator calculator = new Calculator();
        double result = calculator.squareRoot(1000000);
        assertEquals(1000.0, result, 0.0001);
    }

    // factorial functions
    @Test
    public void testFactorial() {
        Calculator calculator = new Calculator();
        long result = calculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialZero() {
        Calculator calculator = new Calculator();
        long result = calculator.factorial(0);
        assertEquals(1, result);
    }

    @Test
    public void testFactorialNegativeNumber() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-3);
        });
    }

    @Test
    public void testFactorialLargeNumber() {
        Calculator calculator = new Calculator();
        long result = calculator.factorial(20);
        assertEquals(2432902008176640000L, result);
    }

    @Test
    public void testFactorialMinValue() {
        Calculator calculator = new Calculator();
        long result = 0;

        try {
            result = calculator.factorial(-1);
        } catch (Exception e) {
            assertEquals("Factorial is not defined for negative numbers", e.getMessage());
        }
        assertEquals(0, result);
    }

    @Test
    public void testFactorialMaxValue() {
        Calculator calculator = new Calculator();

        // Thử gọi hàm factorial với giá trị lớn (ví dụ: 100), kỳ vọng nó sẽ throw exception
        calculator.factorial(100);
    }

    @Test
    public void testCalculateTriangleAreaWithValidSides() {
        Calculator calculator = new Calculator();
        String side1 = "3";
        String side2 = "4";
        String side3 = "5";
        double expectedArea = 6.0;

        try {
            double actualArea = calculator.calculateTriangleArea(side1, side2, side3);
            assertEquals(expectedArea, actualArea, 0.0001);
        } catch (IllegalArgumentException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testCalculateTriangleAreaWithInvalidSides() {
        Calculator calculator = new Calculator();
        String side1 = "1";
        String side2 = "2";
        String side3 = "3";

        IllegalArgumentException thrownException = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateTriangleArea(side1, side2, side3);
        });

        assertEquals("Invalid input. Please enter valid numeric values for triangle sides.", thrownException.getMessage());
    }

    @Test
    public void testCalculateTriangleAreaWithNonNumericInput1() {
        Calculator calculator = new Calculator();
        String side1 = "abc";
        String side2 = "4";
        String side3 = "5";

        try {
            calculator.calculateTriangleArea(side1, side2, side3);
            fail("Expected IllegalArgumentException but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input. Please enter valid numeric values for triangle sides.", e.getMessage());
        }
    }

    @Test
    public void testCalculateTriangleAreaWithNonNumericInput2() {
        Calculator calculator = new Calculator();
        String side1 = "1";
        String side2 = "abc";
        String side3 = "5";
        try {
            calculator.calculateTriangleArea(side1, side2, side3);
            fail("Expected IllegalArgumentException but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input. Please enter valid numeric values for triangle sides.", e.getMessage());
        }
    }

    @Test
    public void testCalculateTriangleAreaWithNonNumericInput3() {
        Calculator calculator = new Calculator();
        String side1 = "3";
        String side2 = "4";
        String side3 = "abc";
        try {
            calculator.calculateTriangleArea(side1, side2, side3);
            fail("Expected IllegalArgumentException but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input. Please enter valid numeric values for triangle sides.", e.getMessage());
        }
    }

    @Test
    public void testCalculateTriangleAreaWithNonNumericInput4() {
        Calculator calculator = new Calculator();
        String side1 = "3";
        String side2 = "null";
        String side3 = "4";
        try {
            calculator.calculateTriangleArea(side1, side2, side3);
            fail("Expected IllegalArgumentException but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input. Please enter valid numeric values for triangle sides.", e.getMessage());
        }
    }

    @Test
    public void testCalculateTriangleAreaWithNonNumericInput5() {
        Calculator calculator = new Calculator();
        String side1 = "null";
        String side2 = "4";
        String side3 = "5";
        try {
            calculator.calculateTriangleArea(side1, side2, side3);
            fail("Expected IllegalArgumentException but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input. Please enter valid numeric values for triangle sides.", e.getMessage());
        }
    }

    @Test
    public void testCalculateTriangleAreaWithNonNumericInput6() {
        Calculator calculator = new Calculator();
        String side1 = "5";
        String side2 = "abc";
        String side3 = "null";
        try {
            calculator.calculateTriangleArea(side1, side2, side3);
            fail("Expected IllegalArgumentException but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input. Please enter valid numeric values for triangle sides.", e.getMessage());
        }
    }

    @Test
    public void testCalculateTriangleAreaWithNonNumericInput7() {
        Calculator calculator = new Calculator();
        String side1 = "";
        String side2 = "4";
        String side3 = "null";
        try {
            calculator.calculateTriangleArea(side1, side2, side3);
            fail("Expected IllegalArgumentException but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input. Please enter valid numeric values for triangle sides.", e.getMessage());
        }
    }

    @Test
    public void testCalculateTriangleAreaWithNonNumericInput8() {
        Calculator calculator = new Calculator();
        String side1 = "5";
        String side2 = "";
        String side3 = "null";
        try {
            calculator.calculateTriangleArea(side1, side2, side3);
            fail("Expected IllegalArgumentException but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input. Please enter valid numeric values for triangle sides.", e.getMessage());
        }
    }

    @Test
    public void testCalculateTriangleAreaWithNonNumericInput10() {
        Calculator calculator = new Calculator();
        String side1 = "5";
        String side2 = "4";
        String side3 = "";
        try {
            calculator.calculateTriangleArea(side1, side2, side3);
            fail("Expected IllegalArgumentException but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input. Please enter valid numeric values for triangle sides.", e.getMessage());
        }
    }
    
      @Test
    public void testCalculateTriangleAreaWithNonNumericInput11() {
        Calculator calculator = new Calculator();
        String side1 = "";
        String side2 = "";
        String side3 = "";
        try {
            calculator.calculateTriangleArea(side1, side2, side3);
            fail("Expected IllegalArgumentException but no exception was thrown.");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid input. Please enter valid numeric values for triangle sides.", e.getMessage());
        }
    }
}
