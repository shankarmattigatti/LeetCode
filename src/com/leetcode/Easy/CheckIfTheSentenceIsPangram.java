package com.leetcode.Easy;

import java.util.*;

// 1832. Check if the Sentence Is Pangram
public class CheckIfTheSentenceIsPangram {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char ch : sentence.toCharArray())
            set.add(ch);

        return set.size() == 26;
    }
}
