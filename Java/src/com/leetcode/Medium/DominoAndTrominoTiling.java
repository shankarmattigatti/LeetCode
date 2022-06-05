package com.leetcode.Medium;

public class DominoAndTrominoTiling {
    public int numTilings(int n) {
        int a = 0, b = 1, c = 1, mod = 1000000007;
        for (int i = 1; i < n; i++) {
            int temp = (c * 2 % mod + a) % mod;
            a = b;
            b = c;
            c = temp;
        }
        return c;
    }
}
