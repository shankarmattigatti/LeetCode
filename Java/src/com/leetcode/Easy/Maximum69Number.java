package com.leetcode.Easy;

// 1323. Maximum 69 Number
public class Maximum69Number {
    public int maximum69Number(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
}
