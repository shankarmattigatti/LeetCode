package com.leetcode.Easy;

import java.util.*;

// 1773. Count Items Matching a Rule
public class CountItemsMatchingARule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0, index = 0;
        if(ruleKey.equals("color"))
            index = 1;
        if(ruleKey.equals("name"))
            index = 2;
        for (List<String> item : items) {
            if(item.get(index).equals(ruleValue))
                count++;
        }

        return count;
    }
}
