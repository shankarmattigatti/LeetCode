package com.leetcode.Easy;

// 1945. Sum of Digits of String After Convert
public class SumOfDigitsOfStringAfterConvert {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            sb.append(ch - 'a' + 1);
        }

        while (k > 0) {
            int sum = 0;
            for (int i = 0; i < sb.length(); i++) {
                sum += Integer.parseInt(String.valueOf(sb.charAt(i)));
            }
            k--;
            sb.setLength(0);
            sb.append(sum);
        }

        return Integer.parseInt(sb.toString());
    }
}
