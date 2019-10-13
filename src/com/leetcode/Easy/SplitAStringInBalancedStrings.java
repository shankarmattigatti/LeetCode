package com.leetcode.Easy;

// 5222. Split a String in Balanced Strings
public class SplitAStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        if (s.isEmpty())
            return 0;

        int LR = 0, count = -1;
        char c = s.charAt(0) == 'L' ? 'L' : 'R';
        for (int i = 0; i < s.length(); i++) {
            if (LR == 0)
                count++;

            if (s.charAt(i) == c)
                LR++;
            else
                LR--;
        }
        return LR == 0 ? ++count : count;
    }
}
