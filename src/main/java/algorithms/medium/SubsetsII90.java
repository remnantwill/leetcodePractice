package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/subsets-ii/
 */
public class SubsetsII90 {

    List<Integer> t = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    /**
     * solution I: iteration
     * @param nums
     * @return
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            t.clear();
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    if (i > 0 && (mask >> (i - 1) & 1) == 0 && nums[i] == nums[i - 1]) {
                        flag = false;
                        break;
                    }
                    t.add(nums[i]);
                }
            }
            if (flag) {
                ans.add(new ArrayList<>(t));
            }
        }
        return ans;
    }

    /**
     * solution II: recursion
     * @param nums
     * @return
     */
    public List<List<Integer>> subsetsWithDupII(int[] nums) {
        Arrays.sort(nums);
        dfs(false, 0, nums);
        return ans;
    }

    private void dfs(boolean choosePre, int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<>(t));
            return;
        }
        dfs(false, cur + 1, nums);
        if (!choosePre && cur > 0 && nums[cur - 1] == nums[cur]) {
            return;
        }
        t.add(nums[cur]);
        dfs(true, cur + 1, nums);
        t.remove(t.size() - 1);
    }

}
