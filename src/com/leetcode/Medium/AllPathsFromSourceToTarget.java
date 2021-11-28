package com.leetcode.Medium;

import java.util.*;

// 797. All Paths From Source to Target
public class AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, paths, path, 0);
        return paths;
    }

    private void dfs(int[][] graph, List<List<Integer>> paths, List<Integer> path, int i) {
        if (i == graph.length - 1) {
            paths.add(new ArrayList<>(path));
        } else {
            for (int j : graph[i]) {
                path.add(j);
                dfs(graph, paths, path, j);
                path.remove(path.size() - 1);
            }
        }
    }
}
