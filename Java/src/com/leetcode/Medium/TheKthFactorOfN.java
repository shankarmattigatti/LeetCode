package com.leetcode.Medium;

// 1492. The kth Factor of n
public class TheKthFactorOfN {
    public int kthFactor(int n, int k) {
        int num = -1;
        for(int i = 1; i <= n && k != 0; i++) {
            if(n % i == 0) {
                num = i;
                k--;
            }
        }
        return k == 0 ? num : -1;
    }
}
