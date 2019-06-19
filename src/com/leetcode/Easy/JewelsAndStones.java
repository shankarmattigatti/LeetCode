package com.leetcode.Easy;

import java.util.*;

// 771. Jewels and Stones
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Set set = new HashSet<>();
        for(Character j : J.toCharArray()) {
            set.add(j);
        }

        for(Character s: S.toCharArray()) {
            if(set.contains(s))
                count++;
        }
        return count;
    }
}
