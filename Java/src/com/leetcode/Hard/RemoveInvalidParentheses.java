package com.leetcode.Hard;

import java.util.*;

// 301. Remove Invalid Parentheses
public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0)
            return result;

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(s);
        visited.add(s);

        boolean found = false;
        while (!queue.isEmpty()) {
            s = queue.poll();

            if (isValid(s)) {
                result.add(s);
                found = true;
            }

            if (found) continue;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '(' && s.charAt(i) != ')')
                    continue;

                String temp = s.substring(0, i) + s.substring(i + 1);
                if (!visited.contains(temp)) {
                    queue.add(temp);
                    visited.add(temp);
                }
            }
        }

        return result;
    }

    private boolean isValid(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(')
                count++;
            if (ch == ')' && count-- == 0)
                return false;
        }
        return count == 0;
    }
}
