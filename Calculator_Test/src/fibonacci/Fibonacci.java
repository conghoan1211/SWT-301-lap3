/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author admin
 */
public class Fibonacci {

    /**
     * Calculates the Fibonacci number at position n by using a recursive
     *
     * @param number is the position of the Fibonacci number to calculate.
     * @return the Fibonacci number at position n.
     */
    private long fiboRecursiveHelper(long n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fiboRecursiveHelper(n - 1) + fiboRecursiveHelper(n - 2);
    }

    public long fiboRecursive(String number) {
        long n = Long.parseLong(number);
        return fiboRecursiveHelper(n);
    }

}
