package com.leetcode.Medium;

import java.util.*;

// 1472. Design Browser History
public class DesignBrowserHistory {
    private final Stack<String> back;
    private final Stack<String> forward;

    public DesignBrowserHistory(String homepage) {
        back = new Stack<>();
        forward = new Stack<>();
        back.push(homepage);
    }

    public void visit(String url) {
        back.push(url);
        forward.clear();
    }

    public String back(int steps) {
        while (steps > 0 && back.size() > 1) {
            forward.push(back.pop());
            steps--;
        }

        return back.peek();
    }

    public String forward(int steps) {
        while (steps > 0 && forward.size() > 0) {
            back.push(forward.pop());
            steps--;
        }

        return back.peek();
    }
}
