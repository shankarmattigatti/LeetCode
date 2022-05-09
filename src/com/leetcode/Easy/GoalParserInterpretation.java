package com.leetcode.Easy;

// 1678. Goal Parser Interpretation
public class GoalParserInterpretation {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (char ch : command.toCharArray()) {
            if (ch == ')') {
                if (temp.toString().equals("("))
                    sb.append('o');
                else
                    sb.append("al");

                temp.setLength(0);
            } else if (ch == 'G') {
                sb.append(ch);
            } else {
                temp.append(ch);
            }
        }
        return sb.toString();
    }
}
