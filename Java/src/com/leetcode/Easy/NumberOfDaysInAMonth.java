package com.leetcode.Easy;

// 1118. Number of Days in a Month
public class NumberOfDaysInAMonth {
    public int numberOfDays(int Y, int M) {
        int number_Of_DaysInMonth = 0;
        switch (M) {
            case 1:
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                if ((Y % 400 == 0) || ((Y % 4 == 0) && (Y % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                number_Of_DaysInMonth = 31;
        }
        return number_Of_DaysInMonth;
    }
}
