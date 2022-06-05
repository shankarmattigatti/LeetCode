package com.leetcode.Easy;

// 1342. Number of Steps to Reduce a Number to Zero
public class NumberOfStepsToReduceANumberToZero {

    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 != 0)
                num -= 1;
            else
                num /= 2;

            count++;
        }
        return count;
    }
}
