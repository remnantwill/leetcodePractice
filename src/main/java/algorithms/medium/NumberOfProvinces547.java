package algorithms.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/number-of-provinces/
 */
public class NumberOfProvinces547 {

    /**
     * solution I: dfs
     * @param isConnected
     * @return
     */
    public int findCircleNum(int[][] isConnected) {
        int provinces = isConnected.length;
        boolean[] visited = new boolean[provinces];
        int circles = 0;
        for (int i = 0; i < provinces; i++) {
            if (!visited[i]) {
                dfs(isConnected, provinces, visited, i);
                circles++;
            }
        }
        return circles;
    }

    private void dfs(int[][] isConnected, int provinces, boolean[] visited, int i) {
        for (int j = 0; j < provinces; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(isConnected, provinces, visited, j);
            }
        }
    }

    /**
     * solution II: bfs
     * @param isConnected
     * @return
     */
    public int findCircleNumII(int[][] isConnected) {
        int provinces = isConnected.length;
        boolean[] visited = new boolean[provinces];
        int circles = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < provinces; i++) {
            if (!visited[i]) {
                queue.offer(i);
                while (!queue.isEmpty()) {
                    Integer j = queue.poll();
                    visited[j] = true;
                    for (int k = 0; k < provinces; k++) {
                        if (isConnected[j][k] == 1 && !visited[k]) {
                            queue.offer(k);
                        }
                    }
                }
                circles++;
            }
        }
        return circles;
    }

    /**
     * solution III: Disjoint Set
     * @param isConnected
     * @return
     */
    public int findCircleNumIII(int[][] isConnected) {
        int provinces = isConnected.length;
        int[] parent = new int[provinces];
        for (int i = 0; i < provinces; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < provinces; i++) {
            for (int j = i + 1; j < provinces; j++) {
                if (isConnected[i][j] == 1) {
                    union(parent, i, j);
                }
            }
        }
        int circles = 0;
        for (int i = 0; i < provinces; i++) {
            if (parent[i] == i) {
                circles++;
            }
        }
        return circles;
    }

    private void union(int[] parent, int i, int j) {
        parent[find(parent, i)] = find(parent, j);
    }

    private int find(int[] parent, int i) {
        if (parent[i] != i) {
            parent[i] = find(parent, parent[i]);
        }
        parent[i] = i;
        return parent[i];
    }

}
