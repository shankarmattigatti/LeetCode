package com.leetcode.Easy;

// 1134. Armstrong Number
public class ArmstrongNumber {

    private static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    private static int power(int x, long y) {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);

        return x * power(x, y / 2) * power(x, y / 2);
    }

    public boolean isArmstrong(int N) {
        int n = countDigits(N);
        int num = N, sum = 0;
        while (N != 0) {
            int digit = N % 10;
            sum += power(digit, n);
            N /= 10;
        }
        return sum == num;
    }
}
