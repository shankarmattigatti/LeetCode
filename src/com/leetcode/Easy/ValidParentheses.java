package com.leetcode.Easy;

import java.util.Stack;

// 20. Valid Parentheses
public class ValidParentheses {

    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }

    public boolean isValid(String str) {
        Stack<Character> stack = new Stack();
        char[] arr = str.toCharArray();

        for (char i : arr) {
            if (i == '(' || i == '{' || i == '[')
                stack.push(i);

            if (i == ')' || i == '}' || i == ']') {
                if (stack.isEmpty())
                    return false;
                else if (!isMatchingPair(stack.pop(), i))
                    return false;
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
