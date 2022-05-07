package com.leetcode.Easy;

// 1507. Reformat Date
public class ReformatDate {
    enum Months {
        Jan, Feb, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
    }

    public String reformatDate(String date) {
        String[] dates = date.split(" ");
        int month = Months.valueOf(dates[1]).ordinal() + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(dates[dates.length - 1]).append("-");
        if (month < 10)
            sb.append(0).append(month).append("-");
        else
            sb.append(month).append("-");

        int day = Integer.parseInt(dates[0].replaceAll("[^0-9]", ""));
        if (day < 10)
            sb.append(0).append(day);
        else
            sb.append(day);

        return sb.toString();
    }
}
