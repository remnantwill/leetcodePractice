package algorithms.easy;

import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/last-stone-weight/
 */
public class LastStoneWeight1046 {

    /**
     * solution: max heap
     * @param stones
     * @return
     */
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1) {
            Integer a = pq.poll();
            Integer b = pq.poll();
            if (a > b) {
                pq.offer(a - b);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }

}
