package algorithms.hard;

import Bean.UnionFind;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/swim-in-rising-water/
 */
public class SwimInRisingWater778 {

    private int N;
    private static final int[][] DIRECTIONS = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    /**
     * solution I: Binary search + traversal
     *
     * @param grid
     * @return
     */
    public int swimInWater(int[][] grid) {
        this.N = grid.length;
        int left = 0;
        int right = N * N - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            boolean[][] visited = new boolean[N][N];
            if (grid[0][0] <= mid && dfs(grid, 0, 0, visited, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean dfs(int[][] grid, int x, int y, boolean[][] visited, int threshold) {
        visited[x][y] = true;
        for (int[] direction : DIRECTIONS) {
            int newX = direction[0] + x;
            int newY = direction[1] + y;
            if (inArea(newX, newY, N) && !visited[newX][newY] && grid[newX][newY] <= threshold) {
                if (newX == N - 1 && newY == N - 1) {
                    return true;
                }
                if (dfs(grid, newX, newY, visited, threshold)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean inArea(int x, int y, int N) {
        if (x >= 0 && x < N && y >= 0 && y < N) {
            return true;
        }
        return false;
    }

    /**
     * solution II: union-find set
     *
     * @param grid
     * @return
     */
    public int swimInWaterII(int[][] grid) {
        this.N = grid.length;
        int len = N * N;
        int[] index = new int[len];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                index[grid[i][j]] = getIndex(i, j);
            }
        }
        UnionFind unionFind = new UnionFind(len);
        for (int i = 0; i < len; i++) {
            int x = index[i] / N;
            int y = index[i] % N;
            for (int[] direction : DIRECTIONS) {
                int newX = direction[0] + x;
                int newY = direction[1] + y;
                if (inArea(newX, newY, N) && grid[newX][newY] <= i) {
                    unionFind.union(index[i], getIndex(newX, newY));
                }
            }
            if (unionFind.connected(0, len - 1)) {
                return i;
            }
        }
        return -1;
    }

    private int getIndex(int x, int y) {
        return x * N + y;
    }

    /**
     * solution III: dijkstra
     * @param grid
     * @return
     */
    public int swimInWaterIII(int[][] grid) {
        N = grid.length;
        int[][] distTo = new int[N][N];
        boolean[][] visited = new boolean[N][N];
        Queue<int[]> minHeap = new PriorityQueue<>(Comparator.comparing(o -> grid[o[0]][o[1]]));
        minHeap.offer(new int[] { 0, 0 });
        for (int[] row : distTo) {
            Arrays.fill(row, N * N);
        }
        distTo[0][0] = grid[0][0];
        while (!minHeap.isEmpty()) {
            int[] front = minHeap.poll();
            int currentX = front[0];
            int currentY = front[1];
            if (visited[currentX][currentY]) {
                continue;
            }
            visited[currentX][currentY] = true;
            if (currentX == N - 1 && currentY == N - 1) {
                return distTo[N - 1][N - 1];
            }
            for (int[] direction : DIRECTIONS) {
                int newX = currentX + direction[0];
                int newY = currentY + direction[1];
                if (inArea(newX, newY, N) && !visited[newX][newY]
                        && Math.max(distTo[currentX][currentY], grid[newX][newY]) < distTo[newX][newY]) {
                    distTo[newX][newY] = Math.max(distTo[currentX][currentY], grid[newX][newY]);
                    minHeap.offer(new int[] { newX, newY });
                }
            }
        }
        return -1;
    }
}
