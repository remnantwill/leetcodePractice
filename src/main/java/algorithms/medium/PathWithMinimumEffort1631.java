package algorithms.medium;

import Bean.UnionFind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/path-with-minimum-effort/
 */
public class PathWithMinimumEffort1631 {

    private int[][] dirs = new int[][] { { -1, 0 }, { 1, 0 }, { 0, 1 }, { 0, -1 } };

    /**
     * solution I: Binary search
     *
     * @param heights
     * @return
     */
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int left = 0, right = 999999, ans = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            Queue<int[]> queue = new LinkedList<>();
            queue.offer(new int[] { 0, 0 });
            boolean[] seen = new boolean[m * n];
            seen[0] = true;
            while (!queue.isEmpty()) {
                int[] cell = queue.poll();
                int x = cell[0];
                int y = cell[1];
                for (int i = 0; i < 4; i++) {
                    int nx = x + dirs[i][0];
                    int ny = y + dirs[i][1];
                    if (nx >= 0 && nx < m && ny >= 0 && ny < n && !seen[nx * n + ny]
                            && Math.abs(heights[x][y] - heights[nx][ny]) <= mid) {
                        queue.offer(new int[] { nx, ny });
                        seen[nx * n + ny] = true;
                    }
                }
            }
            if (seen[m * n - 1]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    /**
     * solution II: union find
     *
     * @param heights
     * @return
     */
    public int minimumEffortPathII(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int id = i * n + j;
                if (i > 0) {
                    edges.add(new int[] { id - n, id, Math.abs(heights[i][j] - heights[i - 1][j]) });
                }
                if (j > 0) {
                    edges.add(new int[] { id - 1, id, Math.abs(heights[i][j] - heights[i][j - 1]) });
                }
            }
        }
        edges.sort(Comparator.comparing(edge -> edge[2]));
        int ans = 0;
        UnionFind uf = new UnionFind(m * n);
        for (int[] edge : edges) {
            int x = edge[0], y = edge[1], v = edge[2];
            uf.union(x, y);
            if (uf.connected(0, m * n - 1)) {
                ans = v;
                break;
            }
        }
        return ans;
    }

    /**
     * solution III: shortest path
     *
     * @param heights
     * @return
     */
    public int minimumEffortPathIII(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(edge -> edge[2]));
        pq.offer(new int[] { 0, 0, 0 });
        int[] dist = new int[m * n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        boolean[] seen = new boolean[m * n];
        while (!pq.isEmpty()) {
            int[] edge = pq.poll();
            int x = edge[0], y = edge[1], d = edge[2];
            int id = x * n + y;
            if (seen[id]) {
                continue;
            }
            if (x == m - 1 && y == n - 1) {
                break;
            }
            seen[id] = true;
            for (int i = 0; i < 4; i++) {
                int nx = x + dirs[i][0];
                int ny = y + dirs[i][1];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && Math.max(
                        d, Math.abs(heights[x][y] - heights[nx][ny])) < dist[nx * n + ny]) {
                    dist[nx * n + ny] = Math.max(d, Math.abs(heights[x][y] - heights[nx][ny]));
                    pq.offer(new int[] { nx, ny, dist[nx * n + ny] });
                }
            }
        }
        return dist[n * m - 1];
    }

}
