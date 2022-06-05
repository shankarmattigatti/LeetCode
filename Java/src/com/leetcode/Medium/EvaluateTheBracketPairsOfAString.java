package com.leetcode.Medium;

import java.util.*;

// 1807. Evaluate the Bracket Pairs of a String
public class EvaluateTheBracketPairsOfAString {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> str : knowledge) {
            map.put(str.get(0), str.get(1));
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (sb.length() != 0 && ch != ')') {
                sb.append(ch);
            } else if (ch == '(') {
                sb.append(ch);
            } else if (ch == ')') {
                String key = sb.substring(1, sb.length());
                res.append(map.getOrDefault(key, "?"));
                sb.setLength(0);
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}
