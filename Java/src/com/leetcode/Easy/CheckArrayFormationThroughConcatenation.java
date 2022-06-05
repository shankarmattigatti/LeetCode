package com.leetcode.Easy;

// 1640. Check Array Formation Through Concatenation
public class CheckArrayFormationThroughConcatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            sb.append(i);
            sb.append("#");
        }

        for (int[] piece : pieces) {
            StringBuilder res = new StringBuilder();
            for (int i : piece) {
                res.append(i);
                res.append("#");
            }
            if (!sb.toString().contains(res.toString()))
                return false;
        }

        return true;
    }
}
