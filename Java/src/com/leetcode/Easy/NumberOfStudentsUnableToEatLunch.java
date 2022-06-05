package com.leetcode.Easy;

import java.util.*;
import java.util.stream.Collectors;

// 1700. Number of Students Unable to Eat Lunch
public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> sd = Arrays.stream(sandwiches).boxed().collect(Collectors.toList());
        for (int student : students)
            queue.add(student);

        int i = 0;
        while (i < sd.size() && queue.contains(sd.get(i))) {
            if (sd.get(i).equals(queue.peek())) {
                queue.poll();
                i++;
            } else {
                queue.add(queue.poll());
            }
        }

        return queue.size();
    }
}
