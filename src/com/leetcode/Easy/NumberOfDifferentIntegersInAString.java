package com.leetcode.Easy;

import java.util.*;

// 1805. Number of Different Integers in a String
public class NumberOfDifferentIntegersInAString {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        String[] arr = word.replaceAll("[a-z]", " ").split(" ");
        for (String a : arr) {
            if (!a.trim().equals("")) {
                a = a.trim().replaceAll("^0*", "");
                set.add(a);
            }
        }
        return set.size();
    }
}
