package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/repeated-substring-pattern/
 */

public class RepeatedSubstringPattern459 {

    /**
     *  first solution
     */
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        boolean match;
        for (int i = 1; i * 2 <= n; ++i) {
            if (n % i == 0) {
                match = true;
                for (int j = i; j < n; ++j) {
                    if (s.charAt(j) != s.charAt(j - i)) {
                        match = false;
                    }
                }
                if (match) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * second solution
     */
    public boolean repeatedSubstringPattern2(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }

}