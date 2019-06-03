package com.leetcode.Easy;

import java.util.*;

// 118. Pascal's Triangle
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            int c = 1;
            List<Integer> ls = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                ls.add(c);
                c = c * (i - j) / j;
            }
            list.add(ls);
        }
        return list;
    }
}
