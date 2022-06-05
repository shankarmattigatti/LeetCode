package com.leetcode.Medium;

import java.util.*;

// 71. Simplify Path
public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] dirs = path.split("/");
        for (String dir : dirs) {
            if (!stack.empty() && dir.equals(".."))
                stack.pop();
            else if (!dir.equals(".") && !dir.equals("") && !dir.equals(".."))
                stack.push(dir);
        }
        List<String> list = new ArrayList<>(stack);
        return "/" + String.join("/", list);
    }
}
