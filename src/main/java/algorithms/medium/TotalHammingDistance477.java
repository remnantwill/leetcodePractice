package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/total-hamming-distance/
 */
public class TotalHammingDistance477 {

    /**
     * solution I: Bit-by-bit statistics
     *
     * @param nums
     * @return
     */
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for (int i = 0; i < 30; i++) {
            int c = 0;
            for (int val : nums) {
                c += (val >> i) & 1;
            }
            ans += c * (n - c);
        }
        return ans;
    }

    /**
     * own solution: exceed time limit
     *
     * @param nums
     * @return
     */
    public int totalHammingDistanceOwn(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans += getHammingDistance(nums[i], nums[j]);
            }
        }
        return ans;
    }

    private int getHammingDistance(int a, int b) {
        //        return Integer.bitCount(a ^ b); this way won't exceed the time limit
        int s = a ^ b;
        int ret = 0;
        while (s != 0) {
            s &= s - 1;
            ret++;
        }
        return ret;
    }

}
