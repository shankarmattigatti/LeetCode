package com.leetcode.Easy;

import java.util.*;

// 682. Baseball Game
public class BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op : ops) {
            switch (op) {
                case "+":
                    int secondNumber = stack.get(stack.size() - 1);
                    int firstNumber = stack.get(stack.size() - 2);
                    stack.push(firstNumber + secondNumber);
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "C":
                    stack.pop();
                    break;
                default:
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }
        int score = 0;
        while (!stack.isEmpty()) {
            score += stack.pop();
        }
        return score;
    }
}
