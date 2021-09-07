package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 */
public class SplitAStringInBalancedStrings1221 {

    public int balancedStringSplit(String s) {
        int ans = 0;
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'L') {
                diff++;
            } else {
                diff--;
            }
            if (diff == 0) {
                ans++;
            }
        }
        return ans;
    }

}
