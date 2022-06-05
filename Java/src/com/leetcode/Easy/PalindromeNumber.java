package com.leetcode.Easy;

// 9. Palindrome Number
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int rev = 0, num = x;
        while (x > 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        return num == rev;
    }
}
