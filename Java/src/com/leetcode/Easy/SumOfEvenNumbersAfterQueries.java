package com.leetcode.Easy;

// 985. Sum of Even Numbers After Queries
public class SumOfEvenNumbersAfterQueries {

    public int[] sumEvenAfterQueries(int[] a, int[][] queries) {
        int x = 0;
        int[] arr = new int[a.length];
        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][1];
            int value = queries[i][0];
            a[index] += value;
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] % 2 == 0)
                    sum += a[j];
            }
            arr[x] = sum;
            x++;
        }
        return arr;
    }
}
