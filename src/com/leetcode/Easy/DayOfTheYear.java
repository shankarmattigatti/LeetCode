package com.leetcode.Easy;

// 1154. Day of the Year
public class DayOfTheYear {
    private boolean checkYear(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return year % 4 == 0;
    }

    public int dayOfYear(String date) {
        String[] str = date.split("-");
        int noOfDays = 0;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeap = checkYear(Integer.parseInt(str[0]));
        for (int i = 0; i < Integer.parseInt(str[1]) - 1; i++) {
            if (isLeap && i == 1) {
                noOfDays += days[i] + 1;
                continue;
            }
            noOfDays += days[i];
        }
        return noOfDays + Integer.parseInt(str[2]);
    }
}
