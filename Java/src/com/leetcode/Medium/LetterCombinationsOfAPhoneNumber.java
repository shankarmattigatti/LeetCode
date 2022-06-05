package com.leetcode.Medium;

import java.util.*;

// 17. Letter Combinations of a Phone Number
public class LetterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits.isEmpty())
            return result;

        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        result.add("");
        while (result.peek().length() != digits.length()) {
            String remove = result.remove();
            String map = mapping[digits.charAt(remove.length()) - '0'];
            for (char ch : map.toCharArray()) {
                result.addLast(remove + ch);
            }
        }

        return result;
    }
}
