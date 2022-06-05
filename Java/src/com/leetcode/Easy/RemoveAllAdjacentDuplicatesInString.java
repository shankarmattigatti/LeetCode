package com.leetcode.Easy;


// 1047. Remove All Adjacent Duplicates In String
public class RemoveAllAdjacentDuplicatesInString {

    static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder(S);
        char[] str = S.toCharArray();
        int i = 0;
        while (i < str.length - 1) {
            if (str[i] == str[i + 1]) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);

                str = sb.toString().toCharArray();
                i = 0;
            } else {
                i++;
            }
        }

        return new String(str);
    }
}
