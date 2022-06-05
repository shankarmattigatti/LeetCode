package com.leetcode.Easy;

// 1021. Remove Outermost Parentheses
public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String S) {
        StringBuilder sb = new StringBuilder();
        int opened = 0;
        for (Character ch : S.toCharArray()) {
            if (ch == '(' && opened++ > 0)
                sb.append(ch);
            if (ch == ')' && opened-- > 1)
                sb.append(ch);
        }
        return sb.toString();
    }
}
