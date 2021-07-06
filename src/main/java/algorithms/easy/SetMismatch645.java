package algorithms.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/set-mismatch/
 */
public class SetMismatch645 {

    /**
     * solution I: sort
     * @param nums
     * @return
     */
    public int[] findErrorNums(int[] nums) {
        int[] errorNums = new int[2];
        int n = nums.length;
        Arrays.sort(nums);
        int prev = 0;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            if (curr == prev) {
                errorNums[0] = curr;
            } else if (curr - prev > 1) {
                errorNums[1] = prev + 1;
            }
            prev = curr;
        }
        if (nums[n - 1] != n) {
            errorNums[1] = n;
        }
        return errorNums;
    }

    /**
     * solution II: hash table
     * @param nums
     * @return
     */
    public int[] findErrorNumsII(int[] nums) {
        int[] errNums = new int[2];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= n; i++) {
            Integer count = map.getOrDefault(i, 0);
            if (count == 2) {
                errNums[0] = i;
            } else if (count == 0) {
                errNums[1] = i;
            }
        }
        return errNums;
    }

}
