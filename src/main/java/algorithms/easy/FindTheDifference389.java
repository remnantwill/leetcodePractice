package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/find-the-difference/
 */
public class FindTheDifference389 {

    /**
     * solution I: count
     * @param s
     * @param t
     * @return
     */
    public char findTheDifference(String s, String t) {
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            cnt[ch - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            cnt[ch - 'a']--;
            if (cnt[ch - 'a'] < 0) {
                return ch;
            }
        }
        return ' ';
    }

    /**
     * solution II: sum
     * @param s
     * @param t
     * @return
     */
    public char findTheDifferenceII(String s, String t) {
        int as = 0, at = 0;
        for (int i = 0; i < s.length(); i++) {
            as += s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            at += t.charAt(i);
        }
        return (char) (at - as);
    }

    /**
     * solution III: bit operation
     * @param s
     * @param t
     * @return
     */
    public char findTheDifferenceIII(String s, String t) {
        int ret = 0;
        for (int i = 0; i < s.length(); ++i) {
            ret ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); ++i) {
            ret ^= t.charAt(i);
        }
        return (char) ret;
    }

    /**
     * own solution
     * @param s
     * @param t
     * @return
     */
    public char findTheDifferenceOwn(String s, String t) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;
        }
        Character ans = null;
        for (int i = 0; i < count.length; i++) {
            if (count[i] == -1) {
                ans = (char)(i + 'a');
            }
        }
        return ans;
    }

}
