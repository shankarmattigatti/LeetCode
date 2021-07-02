package com.leetcode.Easy;

import java.util.Stack;

// 1598. Crawler Log Folder
public class CrawlerLogFolder {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for (String log : logs) {
            if(log.equals("../")) {
                if(!stack.isEmpty())
                    stack.pop();
            } else if(log.equals("./")) {
            } else {
                stack.push(log);
            }
        }
        return stack.size();
    }
}
