package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/island-perimeter/
 */
public class IslandPerimeter463 {

    /**
     * solution I: iteration
     * @param grid
     * @return
     */
    public int islandPerimeter(int[][] grid) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int ans = 0;
        if (grid == null) {
            return 0;
        }
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    int count = 0;
                    for (int k = 0; k < 4; k++) {
                        int tx = i + dx[k];
                        int ty = j + dy[k];
                        if (tx < 0 || tx >= n || ty < 0 || ty >= m || grid[tx][ty] == 0) {
                            ++count;
                        }
                    }
                    ans += count;
                }
            }
        }
        return ans;
    }

    int[] dx = {0, 1, 0, -1};
    int[] dy = {1, 0, -1, 0};
    /**
     * solution II: dfs
     * @param grid
     * @return
     */
    public int islandPerimeterII(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    ans += dfs(i, j, grid, m, n);
                }
            }
        }
        return ans;
    }

    private int dfs(int i, int j, int[][] grid, int m, int n) {
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == 2) {
            return 0;
        }
        grid[i][j] = 2;
        int res = 0;
        for (int k = 0; k < 4; k++) {
            int tx = i + dx[k];
            int ty = j + dy[k];
            res += dfs(tx, ty, grid, m, n);
        }
        return res;
    }

    /**
     * own solution
     * @param grid
     * @return
     */
    public int islandPerimeterOwn(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int n = grid.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int m = grid[i].length;
            for (int j = 0; j < m; j++) {
                // if is land
                if (grid[i][j] == 1) {
                    // if land's left is water, +1 for left side
                    if (j > 0 && grid[i][j - 1]  == 0) {
                        ++count;
                    }
                    // if land is left most, +1 for left side
                    if (j == 0 && grid[i][j] == 1) {
                        ++count;
                    }
                    // if land is right most, +1 for right side
                    if (j == (m - 1) && grid[i][j] == 1) {
                        ++count;
                    }
                    // if land's right is water, +1 for right side
                    if ((j + 1 < m) && grid[i][j + 1] == 0) {
                        ++count;
                    }
                    // if it's top row, +1 for top side
                    if (i == 0) {
                        ++count;
                        // if land's bottom is water, +1 for bottom side
                        if ((i + 1) < n && grid[i + 1][j] == 0) {
                            ++count;
                        }
                    }
                    // if it's bottom row, +1 for bottom side
                    if (i == (n - 1)) {
                        ++count;
                        // if land's top is water, +1 for top side
                        if (i > 0 && grid[i - 1][j] == 0) {
                            ++count;
                        }
                    }
                    // if is between top and bottom row
                    if (i > 0 && i < (n - 1)) {
                        // if land's top is water, +1 for top side
                        if (grid[i - 1][j] == 0) {
                            ++count;
                        }
                        // if land's bottom is water, +1 for bottom side
                        if (grid[i + 1][j] == 0) {
                            ++count;
                        }
                    }
                }
            }
        }
        return count;
    }

}
