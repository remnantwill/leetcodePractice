package algorithms.hard;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * https://leetcode-cn.com/problems/sliding-window-median/
 */
public class SlidingWindowMedian480 {

    public double[] medianSlidingWindow(int[] nums, int k) {
        DualHeap dh = new DualHeap(k);
        for (int i = 0; i < k; i++) {
            dh.insert(nums[i]);
        }
        int n = nums.length;
        double[] ans = new double[n - k + 1];
        ans[0] = dh.getMedian();
        for (int i = k; i < n; i++) {
            dh.insert(nums[i]);
            dh.erase(nums[i - k]);
            ans[i - k + 1] = dh.getMedian();
        }
        return ans;
    }

    private class DualHeap {
        private int k;
        private PriorityQueue<Integer> small;
        private PriorityQueue<Integer> large;
        private int smallSize;
        private int largeSize;
        private Map<Integer, Integer> delayed;

        public DualHeap(int k) {
            this.k = k;
            small = new PriorityQueue<>(Comparator.reverseOrder());
            large = new PriorityQueue<>(Integer::compareTo);
            smallSize = 0;
            largeSize = 0;
            delayed = new HashMap<>();
        }

        public double getMedian() {
           return (k & 1) == 1 ? small.peek() : ((double) (small.peek() + large.peek()) / 2);
        }

        public void insert(int num) {
            if (small.isEmpty() || num <= small.peek()) {
                small.offer(num);
                smallSize++;
            } else {
                large.offer(num);
                largeSize++;
            }
            makeBalance();
        }

        public void erase(int num) {
            delayed.put(num, delayed.getOrDefault(num, 0) + 1);
            if (num <= small.peek()) {
                smallSize--;
                if (num == small.peek()) {
                    prune(small);
                }
            } else {
                largeSize--;
                if (num == large.peek()) {
                    prune(large);
                }
            }
            makeBalance();
        }

        private void makeBalance() {
            if (smallSize > largeSize + 1) {
                large.offer(small.poll());
                smallSize--;
                largeSize++;
                prune(small);
            } else if (largeSize > smallSize) {
                small.offer(large.poll());
                largeSize--;
                smallSize++;
                prune(large);
            }
        }

        private void prune(PriorityQueue<Integer> heap) {
            while (!heap.isEmpty()) {
                Integer num = heap.peek();
                if (delayed.containsKey(num)) {
                    delayed.put(num, delayed.get(num) - 1);
                    if (delayed.get(num) == 0) {
                        delayed.remove(num);
                    }
                    heap.poll();
                } else {
                    break;
                }
            }
        }
    }
}
