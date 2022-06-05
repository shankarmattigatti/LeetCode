package com.leetcode.Easy;

// 1629. Slowest Key
public class SlowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char key = keysPressed.charAt(0);

        for (int i = 1; i < releaseTimes.length; i++) {
            int diff = Math.abs(releaseTimes[i - 1] - releaseTimes[i]);
            if (diff >= max) {
                if (diff > max)
                    key = keysPressed.charAt(i);
                else
                    key = key > keysPressed.charAt(i) ? key : keysPressed.charAt(i);
                max = diff;
            }
        }
        return key;
    }
}
