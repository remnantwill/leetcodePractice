package algorithms.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/k-closest-points-to-origin/
 */
public class KClosestPointsToOrigin973 {

    /**
     * solution I: sorting
     * @param points
     * @param K
     * @return
     */
    public int[][] kClosest(int[][] points, int K) {
        Arrays.sort(points, Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        return Arrays.copyOfRange(points, 0, K);
    }

    /**
     * solution II: priority queue
     * @param points
     * @param K
     * @return
     */
    public int[][] kClosestII(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o2[0] - o1[0]);
        for (int i = 0; i < K; i++) {
            pq.offer(new int[]{(points[i][0] * points[i][0] + points[i][1] * points[i][1]), i});
        }
        int n = points.length;
        for (int i = K; i < n; ++i) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            if (dist < pq.peek()[0]) {
                pq.poll();
                pq.offer(new int[]{dist, i});
            }
        }
        int[][] ans = new int[K][2];
        for (int i = 0; i < K; i++) {
            ans[i] = points[Objects.requireNonNull(pq.poll())[1]];
        }
        return ans;
    }

}
