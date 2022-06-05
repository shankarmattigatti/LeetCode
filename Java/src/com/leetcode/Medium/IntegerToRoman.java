package com.leetcode.Medium;

// 12. Integer to Roman
public class IntegerToRoman {
    public String intToRoman(int num) {
        int[] arr = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            while (num >= arr[i]) {
                num -= arr[i];
                res.append(symbols[i]);
            }
        }
        return res.toString();
    }
}
