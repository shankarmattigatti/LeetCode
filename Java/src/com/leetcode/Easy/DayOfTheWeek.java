package com.leetcode.Easy;

// 5183. Day of the Week
public class DayOfTheWeek {
    public String dayOfTheWeek(int d, int m, int y) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        y -= (m < 3) ? 1 : 0;
        int day = (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            default:
                return "Sunday";
        }
    }
}
