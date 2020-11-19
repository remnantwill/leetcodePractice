package algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/matrix-cells-in-distance-order/
 */
public class MatrixCellsInDistanceOrder1030 {

    /**
     * solution I: direct sort
     */
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ret = new int[R * C][];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                ret[i * C + j] = new int[] { i, j };
            }
        }
        Arrays.sort(ret, Comparator.comparingInt(a -> (Math.abs(a[0] - r0) + Math.abs(a[1] - c0))));
        return ret;
    }

    /**
     * solution II: bucket sort
     */
    public int[][] allCellsDistOrderII(int R, int C, int r0, int c0) {
        int maxDist = Math.max(r0, R - 1 - r0) + Math.max(c0, C - 1 - c0);
        List<List<int[]>> bucket = new ArrayList<>();
        for (int i = 0; i <= maxDist; i++) {
            bucket.add(new ArrayList<>());
        }
        int[][] ret = new int[R * C][];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int d = getDist(i, j, r0, c0);
                bucket.get(d).add(new int[] { i, j });
            }
        }
        int index = 0;
        for (int i = 0; i <= maxDist; i++) {
            for (int[] it : bucket.get(i)) {
                ret[index++] = it;
            }
        }
        return ret;
    }

    private int getDist(int r1, int c1, int r0, int c0) {
        return Math.abs(r1 - r0) + Math.abs(c1 - c0);
    }

    int[] dr = {1, 1, -1, -1};
    int[] dc = {1, -1, -1, 1};

    /**
     * solution III: Geometric method
     */
    public int[][] allCellsDistOrderIII(int R, int C, int r0, int c0) {
        int maxDist = Math.max(r0, R - 1 - r0) + Math.max(c0, C - 1 - c0);
        int[][] ret = new int[R * C][];
        int row = r0, col = c0;
        int index = 0;
        ret[index++] = new int[] {row, col};
        for (int dist = 1; dist <= maxDist; dist++) {
            row--;
            for (int i = 0; i < 4; i++) {
                while ((i % 2 == 0 && row != r0) || (i % 2 != 0 && col != c0)) {
                    if (row >= 0 && row < R && col >= 0 && col < C) {
                        ret[index++] = new int[] { row, col };
                    }
                    row += dr[i];
                    col += dc[i];
                }
            }
        }

        return ret;
    }

}
