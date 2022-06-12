package com.leetcode.Medium;

// 299. Bulls and Cows
public class BullsAndCows {
    public String GetHint(String secret, String guess) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        int countBulls = 0, countCows = 0;
        for (int i = 0; i < secret.length(); i++) {
            char ch1 = secret.charAt(i), ch2 = guess.charAt(i);
            if (ch1 == ch2) {
                countBulls++;
            } else {
                arr1[ch1 - '0']++;
                arr2[ch2 - '0']++;
            }
        }

        for (int i = 0; i < 10; i++)
            countCows += Math.min(arr1[i], arr2[i]);

        return countBulls + "A" + countCows + "B";
    }
}
