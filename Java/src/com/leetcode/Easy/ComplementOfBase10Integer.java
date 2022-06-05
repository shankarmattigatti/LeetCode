package com.leetcode.Easy;

// 1009. Complement of Base 10 Integer
public class ComplementOfBase10Integer {
    public int bitwiseComplement(int N) {
        String str = Integer.toBinaryString(N);
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            sb.append(ch == '1' ? 0 : 1);
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
