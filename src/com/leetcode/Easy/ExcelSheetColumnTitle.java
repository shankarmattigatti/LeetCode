package com.leetcode.Easy;

// 168. Excel Sheet Column Title
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = n % 26;
            if (rem == 0) {
                sb.append("Z");
                n = (n / 26) - 1;
            } else {
                sb.append((char) ((rem - 1) + 'A'));
                n /= 26;
            }
        }
        return sb.reverse().toString();
    }
}
