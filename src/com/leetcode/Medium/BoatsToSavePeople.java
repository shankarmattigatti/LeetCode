package com.leetcode.Medium;

import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int minNumberOfBoats = 0;
        int i = 0, j = people.length - 1;
        while (i <= j) {
            if (people[i] + people[j] <= limit)
                i++;

            j--;
            minNumberOfBoats++;
        }

        return minNumberOfBoats;
    }
}
