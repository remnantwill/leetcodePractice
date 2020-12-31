package algorithms.medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode-cn.com/problems/non-overlapping-intervals/
 */
public class NonoverlappingIntervals435 {

    /**
     * solution I: dp
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int[] f = new int[n];
        Arrays.fill(f, 1);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (intervals[j][1] <= intervals[i][0]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
            }
        }
        return n - Arrays.stream(f).max().getAsInt();
    }

    /**
     * solution II: greedy
     * @param intervals
     * @return
     */
    public int eraseOverlapIntervalsII(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int ans = 1;
        int right = intervals[0][1];
        for (int i = 1; i < n; i++) {
            if (intervals[i][0] >= right) {
                ++ans;
                right = intervals[i][1];
            }
        }
        return n - ans;
    }

}
