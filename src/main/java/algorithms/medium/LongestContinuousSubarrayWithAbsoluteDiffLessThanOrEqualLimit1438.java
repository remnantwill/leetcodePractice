package algorithms.medium;

import java.util.Deque;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 * https://leetcode-cn.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
 */
public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualLimit1438 {

    /**
     * solution I: Sliding window + ordered collection
     * @param nums
     * @param limit
     * @return
     */
    public int longestSubarray(int[] nums, int limit) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = nums.length;
        int left = 0;
        int right = 0;
        int ret = 0;
        while (right < n) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (map.lastKey() - map.firstKey() > limit) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                ++left;
            }
            ret = Math.max(ret, right - left + 1);
            ++right;
        }
        return ret;
    }

    /**
     * solution II: Sliding window + monotonic queue
     * @param nums
     * @param limit
     * @return
     */
    public int longestSubarrayII(int[] nums, int limit) {
        Deque<Integer> minQue = new LinkedList<>();
        Deque<Integer> maxQue = new LinkedList<>();
        int n = nums.length;
        int left = 0;
        int right = 0;
        int ret = 0;
        while (right < n) {
            if (!maxQue.isEmpty() && maxQue.peekLast() < nums[right]) {
                maxQue.pollLast();
            }
            if (!minQue.isEmpty() && minQue.peekLast() > nums[right]) {
                minQue.pollLast();
            }
            maxQue.offerLast(nums[right]);
            minQue.offerLast(nums[right]);
            while (!minQue.isEmpty() && !maxQue.isEmpty() && maxQue.peekFirst() - minQue.peekFirst() > limit) {
                if (nums[left] == maxQue.peekFirst()) {
                    maxQue.pollFirst();
                }
                if (nums[left] == minQue.peekFirst()) {
                    minQue.pollFirst();
                }
                ++left;
            }
            ret = Math.max(ret, right - left + 1);
            ++right;
        }
        return ret;
    }

}
