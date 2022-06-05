package com.leetcode.Easy;

// 476. Number Complement
public class NumberComplement {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (char ch : binary.toCharArray())
            sb.append(ch == '1' ? 0 : 1);

        return Integer.parseInt(sb.toString(), 2);
    }
}
