package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/summary-ranges/
 */
public class SummaryRanges228 {

    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        int i = 0;
        List<String> ans = new ArrayList<>();
        while (i < n) {
            int low = i;
            i++;
            while (i < n && nums[i] == nums[i - 1] + 1) {
                i++;
            }
            int high = i - 1;
            StringBuffer temp = new StringBuffer(Integer.toString(nums[low]));
            if (low < high) {
                temp.append("->").append(nums[high]);
            }
            ans.add(temp.toString());
        }
        return ans;
    }

}
