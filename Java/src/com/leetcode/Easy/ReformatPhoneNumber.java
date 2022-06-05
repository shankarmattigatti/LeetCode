package com.leetcode.Easy;

import java.util.*;

// 1694. Reformat Phone Number
public class ReformatPhoneNumber {
    public String reformatNumber(String number) {
        StringBuilder res = new StringBuilder();
        Queue<Character> queue = new LinkedList<>();
        for (char ch : number.toCharArray()) {
            if (Character.isDigit(ch))
                queue.add(ch);
        }

        while (!queue.isEmpty()) {
            if (queue.size() > 4) {
                res.append(queue.poll());
                res.append(queue.poll());
                res.append(queue.poll());
                if (!queue.isEmpty())
                    res.append("-");
            } else {
                if (queue.size() == 3) {
                    res.append(queue.poll());
                    res.append(queue.poll());
                    res.append(queue.poll());
                    if (!queue.isEmpty())
                        res.append("-");
                } else {
                    res.append(queue.poll());
                    res.append(queue.poll());
                    if (!queue.isEmpty())
                        res.append("-");
                }
            }
        }

        return res.toString();
    }
}
