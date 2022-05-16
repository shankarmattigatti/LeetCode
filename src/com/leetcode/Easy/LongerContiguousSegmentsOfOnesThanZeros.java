package com.leetcode.Easy;

// 1869. Longer Contiguous Segments of Ones than Zeros
public class LongerContiguousSegmentsOfOnesThanZeros {
    public boolean checkZeroOnes(String s) {
        int maxZeros = 0, maxOnes = 0;
        int countZeros = 0, countOnes = 0;
        for (int ch : s.toCharArray()) {
            if (ch == '0') {
                countZeros++;
                maxOnes = Math.max(maxOnes, countOnes);
                countOnes = 0;
            } else {
                countOnes++;
                maxZeros = Math.max(maxZeros, countZeros);
                countZeros = 0;
            }
        }
        maxOnes = Math.max(maxOnes, countOnes);
        maxZeros = Math.max(maxZeros, countZeros);
        return maxOnes > maxZeros;
    }
}
