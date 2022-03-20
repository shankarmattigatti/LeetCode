package com.leetcode.Easy;

import java.util.*;

// 937. Reorder Data in Log Files
public class ReorderDataInLogFiles {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> comp = (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);

            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

            if (!isDigit1 && !isDigit2) {
                int cmp = split1[1].compareTo(split2[1]);
                return cmp != 0 ? cmp : split1[0].compareTo(split2[0]);
            }

            if (!isDigit1)
                return -1;
            if (!isDigit2)
                return 1;
            else
                return 0;
        };

        Arrays.sort(logs, comp);
        return logs;
    }
}
