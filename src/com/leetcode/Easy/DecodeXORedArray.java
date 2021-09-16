package com.leetcode.Easy;

// 1720. Decode XORed Array
public class DecodeXORedArray {
    public int[] decode(int[] encoded, int first) {
        int[] res = new int[encoded.length + 1];
        res[0] = first;

        int i = 1, j = 0;
        while (j < encoded.length) {
            res[i] = res[i - 1] ^ encoded[j++];
            i++;
        }
        return res;
    }
}
