package algorithms.medium;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/largest-number/
 */
public class LargestNumber179 {

    public String largestNumber(int[] nums) {
        int n = nums.length;
        Integer[] newArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            newArr[i] = nums[i];
        }
        Arrays.sort(newArr, (x, y) -> {
            long sx = 10;
            long sy = 10;
            while (sx <= x) {
                sx *= 10;
            }
            while (sy <= y) {
                sy *= 10;
            }
            return (int) (-sy * x - y + sx * y + x);
        });
        if (newArr[0] == 0) {
            return "0";
        }
        StringBuilder ret = new StringBuilder();
        for (Integer integer : newArr) {
            ret.append(integer);
        }
        return ret.toString();
    }

}
