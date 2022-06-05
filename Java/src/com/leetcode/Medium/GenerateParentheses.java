package com.leetcode.Medium;

import java.util.*;

// 22. Generate Parentheses
public class GenerateParentheses {
    static class Parenthesis {
        public String str;
        public int openCount, closeCount;

        public Parenthesis(String str, int openCount, int closeCount) {
            this.str = str;
            this.openCount = openCount;
            this.closeCount = closeCount;
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        Queue<Parenthesis> queue = new LinkedList<>();
        queue.add(new Parenthesis("", 0, 0));
        while (!queue.isEmpty()) {
            Parenthesis ps = queue.poll();
            if (ps.openCount == n && ps.closeCount == n) {
                result.add(ps.str);
            } else {
                if (ps.openCount < n)
                    queue.add(new Parenthesis(ps.str + "(", ps.openCount + 1, ps.closeCount));

                if (ps.openCount > ps.closeCount)
                    queue.add(new Parenthesis(ps.str + ")", ps.openCount, ps.closeCount + 1));
            }
        }
        return result;
    }
}
