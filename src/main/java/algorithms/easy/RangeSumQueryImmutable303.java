package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/range-sum-query-immutable/
 */
public class RangeSumQueryImmutable303 {
}

class NumArray {

    int[] sums;

    public NumArray(int[] nums) {
        int n = nums.length;
        sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }
}
