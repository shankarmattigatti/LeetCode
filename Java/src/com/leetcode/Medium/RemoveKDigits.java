package com.leetcode.Medium;

// 402. Remove K Digits
public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (num.length() == k)
            return "0";

        StringBuilder sb = new StringBuilder(num);
        for (int j = 0; j < k; j++) {
            int i = 0;
            while (i < sb.length() - 1 && sb.charAt(i) <= sb.charAt(i + 1))
                i++;

            sb.delete(i, i + 1);
        }

        while (sb.length() > 1 && sb.charAt(0) == '0')
            sb.delete(0, 1);

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
