package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/partition-labels/
 */
public class PartitionLabels763 {

    public List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        int length = S.length();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            last[S.charAt(i) - 'a'] = i;
        }
        int start = 0, end = 0;
        for (int i = 0; i < length; i++) {
            end = Math.max(end, last[S.charAt(i) - 'a']);
            if (i == end) {
                ans.add(end - start + 1);
                start = end + 1;
            }
        }
        return ans;
    }

}
