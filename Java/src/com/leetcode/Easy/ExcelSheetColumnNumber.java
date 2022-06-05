package com.leetcode.Easy;

// 171. Excel Sheet Column Number
public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int ans = 0;
        for (char ch : s.toCharArray()) {
            ans *= 26;
            ans += ch - 'A' + 1;
        }
        return ans;
    }
}
