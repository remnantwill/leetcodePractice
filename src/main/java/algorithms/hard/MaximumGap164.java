package algorithms.hard;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/maximum-gap/
 */
public class MaximumGap164 {

    /**
     * solution I: radix sort
     * @param nums
     * @return
     */
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        long exponent = 1;
        int[] buf = new int[n];
        int maxValue = Arrays.stream(nums).max().getAsInt();
        while (maxValue >= exponent) {
            int[] count = new int[10];
            for (int i = 0; i < n; i++) {
                int digit = (nums[i] / (int) exponent) % 10;
                count[digit]++;
            }
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }
            for (int i = n - 1; i >= 0; i--) {
                int digit = (nums[i] / (int) exponent) % 10;
                buf[count[digit] - 1] = nums[i];
                count[digit]--;
            }
            System.arraycopy(buf, 0, nums, 0, n);
            exponent *= 10;
        }
        int ret = 0;
        for (int i = 1; i < n; i++) {
            ret = Math.max(ret, nums[i] - nums[i - 1]);
        }
        return ret;
    }



    /**
     * solution II: Bucket-based algorithm
     * @param nums
     * @return
     */
    public int maximumGapII(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return 0;
        }
        int minVal = Arrays.stream(nums).min().getAsInt();
        int maxVal = Arrays.stream(nums).max().getAsInt();
        int d = Math.max(1, (maxVal - minVal) / (n - 1));
        int bucketSize = (maxVal - minVal) / d + 1;
        int[][] bucket = new int[bucketSize][2];
        for (int i = 0; i < bucketSize; i++) {
            Arrays.fill(bucket[i], -1);
        }
        for (int i = 0; i < n; i++) {
            int idx = (nums[i] - minVal) / d;
            if (bucket[idx][0] == -1) {
                bucket[idx][0] = bucket[idx][1] = nums[i];
            } else {
                bucket[idx][0] = Math.min(bucket[idx][0], nums[i]);
                bucket[idx][1] = Math.max(bucket[idx][1], nums[i]);
            }
        }
        int ret = 0;
        int prev = -1;
        for (int i = 0; i < n; i++) {
            if (bucket[i][0] == -1) {
                continue;
            }
            if (prev != -1) {
                ret = Math.max(ret, bucket[i][0] - bucket[prev][1]);
            }
            prev = i;
        }
        return ret;
    }

    /**
     * own solution
     * @param nums
     * @return
     */
    public int maximumGapOwn(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        Arrays.sort(nums);
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length) {
                max = Math.max(max, nums[i + 1] - nums[i]);
            }
        }
        return max;
    }

}
