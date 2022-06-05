package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

// 1324. Print Words Vertically
public class PrintWordsVertically {
    static int maxChar(String[] str) {
        int max = 0;
        for (String st : str) {
            if (st.length() > max) {
                max = st.length();
            }
        }
        return max;
    }

    public List<String> printVertically(String s) {
        String[] str = s.split(" ");
        List<String> ls = new ArrayList<>();
        int max = maxChar(str);
        for (int i = 0; i < max; i++) {
            StringBuilder sb = new StringBuilder();
            for (String value : str) {
                if (i < value.length())
                    sb.append(value.charAt(i));
                else
                    sb.append(" ");
            }
            ls.add(sb.toString().stripTrailing());
        }
        return ls;
    }
}
