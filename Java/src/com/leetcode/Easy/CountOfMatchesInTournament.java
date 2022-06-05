package com.leetcode.Easy;

// 1688. Count of Matches in Tournament
public class CountOfMatchesInTournament {
    public int numberOfMatches(int n) {
        int matches = 0;
        while (n != 1) {
            matches += n / 2;
            int odd = n % 2 == 0 ? 0 : 1;
            n /= 2;
            n += odd;
        }
        return matches;
    }
}
