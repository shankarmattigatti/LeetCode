package com.leetcode.Medium;

// 165. Compare Version Numbers
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int i = 0;
        while (i < v1.length || i < v2.length) {
            if (i < v1.length && i < v2.length) {
                int n1 = Integer.parseInt(v1[i]);
                int n2 = Integer.parseInt(v2[i]);
                if (n1 > n2)
                    return 1;
                if (n1 < n2)
                    return -1;
            } else if (i < v1.length) {
                if (Integer.parseInt(v1[i]) != 0)
                    return 1;
            } else {
                if (Integer.parseInt(v2[i]) != 0)
                    return -1;
            }
            i++;
        }
        return 0;
    }
}
