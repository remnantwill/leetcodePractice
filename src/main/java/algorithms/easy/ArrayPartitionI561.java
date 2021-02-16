package algorithms.easy;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/array-partition-i/
 */
public class ArrayPartitionI561 {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i += 2) {
            ans += nums[i];
        }
        return ans;
    }

}
