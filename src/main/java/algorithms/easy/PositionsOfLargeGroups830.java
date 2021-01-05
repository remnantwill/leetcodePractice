package algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/positions-of-large-groups/
 */
public class PositionsOfLargeGroups830 {

    /**
     * official solution: one time traversal
     * @param s
     * @return
     */
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = s.length();
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (num >= 3) {
                    ans.add(Arrays.asList(i - num + 1, i));
                }
                num = 1;
            } else {
                num++;
            }
        }
        return ans;
    }

    /**
     * own solution
     * @param s
     * @return
     */
    public List<List<Integer>> largeGroupPositionsOwn(String s) {
        char[] chars = s.toCharArray();
        char prevChar = chars[0];
        int beginIdx = 0, endIdx = 0, count = 0;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i < chars.length; i++) {
            char c = s.charAt(i);
            char nextChar = '0';
            if (i + 1 < s.length()) {
                nextChar = s.charAt(i + 1);
            }
            if (prevChar == c) {
                ++count;
            } else {
                count = 0;
            }
            if (count >= 2 && c != nextChar) {
                List<Integer> list = new ArrayList<>();
                beginIdx = i - count;
                endIdx = i;
                list.add(beginIdx);
                list.add(endIdx);
                ans.add(list);

            }
            prevChar = c;
        }
        return ans;
    }

}
