/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author admin
 */
public class Calculator {

    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        double result = (double) a / b;

        // Check if the result is infinite or NaN
        if (!Double.isFinite(result)) {
            throw new ArithmeticException("Result is too large or too small to represent as a double.");
        }

        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }
    
  public double power(double base, double exponent) {
        double result = Math.pow(base, exponent);

        // Check if the result is infinite or NaN
        if (!Double.isFinite(result)) {
            throw new ArithmeticException("Result is too large or too small to represent as a double.");
        }

        return result;
    }

    public double squareRoot(double number) {
        double result = Math.sqrt(number);
        return result;
    }

    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
     public double calculateTriangleArea(String side1, String side2, String side3) {
        try {
            double a = Double.parseDouble(side1);
            double b = Double.parseDouble(side2);
            double c = Double.parseDouble(side3);

            // Check if the sides form a valid triangle
            if (isValidTriangle(a, b, c)) {
                double s = (a + b + c) / 2;
                return Math.sqrt(s * (s - a) * (s - b) * (s - c));
            } else {
                throw new IllegalArgumentException("Invalid triangle sides");
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid input. Please enter valid numeric values for triangle sides.");
        }
    }

    private  boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
