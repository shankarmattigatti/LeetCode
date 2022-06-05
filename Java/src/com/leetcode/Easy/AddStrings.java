package com.leetcode.Easy;

// 415. Add Strings
public class AddStrings {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = (i == -1 ? 0 : Integer.parseInt(String.valueOf(num1.charAt(i)))) +
                    (j == -1 ? 0 : Integer.parseInt(String.valueOf(num2.charAt(j)))) + carry;

            sb.append(sum % 10);
            carry = sum / 10;

            i = i == -1 ? i : i - 1;
            j = j == -1 ? j : j - 1;
        }
        return sb.reverse().toString();
    }
}
