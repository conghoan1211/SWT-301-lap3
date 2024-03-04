/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discount_calculator;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */

public class ComplexDiscountCalculator {

    // Map lưu trữ giảm giá cho mỗi mức số lượng sản phẩm
    private Map<Integer, Double> discountRates;

    public ComplexDiscountCalculator() {
        discountRates = new HashMap<>();
        discountRates.put(5, 2.0);  // Giảm giá 2 đồng cho mỗi sản phẩm nếu mua từ 5 sản phẩm
        discountRates.put(10, 3.0); // Giảm giá 3 đồng cho mỗi sản phẩm nếu mua từ 10 sản phẩm
    }

    public double calculateDiscount(int itemCount, double itemPrice) {
        double discount = 0;

        // Áp dụng giảm giá cộng dồn theo số lượng sản phẩm
        for (Map.Entry<Integer, Double> entry : discountRates.entrySet()) {
            int threshold = entry.getKey();
            if (itemCount >= threshold) {
                discount += entry.getValue() * itemCount;
            }
        }

        return discount;
    }
}
