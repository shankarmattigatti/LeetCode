package com.leetcode.Easy;

// 2011. Final Value of Variable After Performing Operations
public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if (operation.contains("++")) {
                result++;
            } else {
                result--;
            }
        }
        return result;
    }
}
