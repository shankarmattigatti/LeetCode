package com.leetcode.Easy;

// 1422. Maximum Score After Splitting a String
public class MaximumScoreAfterSplittingAString {
    private int countZeros(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '0')
                count++;
        }
        return count;
    }

    private int countOnes(String s) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1')
                count++;
        }
        return count;
    }

    public int maxScore(String s) {
        int maxScore = 0, n = s.length();
        for (int i = 0; i < n - 1; i++) {
            int left = countZeros(s.substring(0, i + 1));
            int right = countOnes(s.substring(i + 1, n));
            maxScore = Math.max(maxScore, left + right);
        }
        return maxScore;
    }
}
