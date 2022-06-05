package com.leetcode.Medium;

import java.util.*;

// 735. Asteroid Collision
public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0 || stack.isEmpty() || stack.getLast() < 0)
                stack.add(asteroids[i]);
            else if (stack.getLast() <= -asteroids[i])
                if (stack.pollLast() < -asteroids[i])
                    i--;
        }
        return stack.stream().mapToInt(i -> i).toArray();
    }
}
