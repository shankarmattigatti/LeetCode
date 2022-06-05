package com.leetcode.Easy;

// 1556. Thousand Separator
public class ThousandSeparator {
    public String thousandSeparator(int n) {
        if (n == 0) return "0";

        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int digit = n % 10;
            sb.append(digit);
            n /= 10;
            count++;
            if (count == 3 && n != 0) {
                sb.append(".");
                count = 0;
            }
        }
        return sb.reverse().toString();
    }
}
