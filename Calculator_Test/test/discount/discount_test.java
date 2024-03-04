/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package discount;

import discount_calculator.ComplexDiscountCalculator;
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
public class discount_test {
    
    public discount_test() {
    }
    
  
    @Test
    public void testCalculateDiscount() {
        ComplexDiscountCalculator calculator = new ComplexDiscountCalculator();

        // Test case 1: Kiểm tra giảm giá cho 5 sản phẩm, tổng hóa đơn là 100
        int itemCount1 = 5;
        double itemPrice1 = 20;
        double expectedDiscount1 = 10; // Giảm giá 10 đồng cho mỗi sản phẩm
        assertEquals(expectedDiscount1, calculator.calculateDiscount(itemCount1, itemPrice1), 0.01);

        // Test case 2: Kiểm tra giảm giá cho 3 sản phẩm, tổng hóa đơn là 50
        int itemCount2 = 3;
        double itemPrice2 = 15;
        assertEquals(0, calculator.calculateDiscount(itemCount2, itemPrice2), 0.01);

        // Test case 3: Kiểm tra giảm giá cho 10 sản phẩm, tổng hóa đơn là 200
        int itemCount3 = 10;
        double itemPrice3 = 20;
        double expectedDiscount3 = 30; // Giảm giá 3 đồng cho mỗi sản phẩm
        assertEquals(expectedDiscount3, calculator.calculateDiscount(itemCount3, itemPrice3), 0.01);
    }
}
