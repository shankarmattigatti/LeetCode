package com.leetcode.Easy;

// 67. Add Binary
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int s = 0;
        int i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0 || s == 1) {

            s += ((i >= 0) ? a.charAt(i) - '0' : 0);
            s += ((j >= 0) ? b.charAt(j) - '0' : 0);

            result.insert(0, (char) (s % 2 + '0'));

            s /= 2;

            i--;
            j--;
        }
        return result.toString();
    }
}
