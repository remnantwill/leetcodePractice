package algorithms.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/single-number-ii/
 */
public class SingleNumberII137 {

    /**
     * solution I: hashmap
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            Integer num = entry.getKey();
            Integer ooc = entry.getValue();
            if (ooc == 1) {
                ans = num;
                break;
            }
        }
        return ans;
    }

    /**
     * solution II: bit operation
     * @param nums
     * @return
     */
    public int singleNumberII(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int total = 0;
            for (int num : nums) {
                total += (num >> i) & 1;
            }
            if (total % 3 != 0) {
                ans |= (1 << i);
            }
        }
        return ans;
    }

}
