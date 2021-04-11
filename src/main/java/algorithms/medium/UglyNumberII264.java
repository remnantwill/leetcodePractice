package algorithms.medium;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/ugly-number-ii/
 */
public class UglyNumberII264 {

    /**
     * solution I: min heap
     *
     * @param n
     * @return
     */
    public int nthUglyNumber(int n) {
        int[] factors = new int[]{2, 3, 5};
        Set<Long> seen = new HashSet<>();
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        seen.add(1L);
        minHeap.offer(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long cur = minHeap.poll();
            ugly = (int) cur;
            for (int factor : factors) {
                long next = cur * factor;
                if (seen.add(next)) {
                    minHeap.offer(next);
                }
            }
        }
        return ugly;
    }

    /**
     * solution II:
     *
     * @param n
     * @return
     */
    public int nthUglyNumberII(int n) {
        int[] dp = new int[n + 1];
        int p2 = 1;
        int p3 = 1;
        int p5 = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int num2 = dp[p2] * 2;
            int num3 = dp[p3] * 3;
            int num5 = dp[p5] * 5;
            dp[i] = Math.min(Math.min(num2, num3), num5);
            if (dp[i] == num2) {
                p2++;
            }
            if (dp[i] == num3) {
                p3++;
            }
            if (dp[i] == num5) {
                p5++;
            }
        }
        return dp[n];
    }

}
