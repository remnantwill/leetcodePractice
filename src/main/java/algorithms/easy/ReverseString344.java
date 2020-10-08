package algorithms.easy;


/**
 * https://leetcode-cn.com/problems/reverse-string/
 */
public class ReverseString344 {

    public void reverseString(char[] s) {
        int n = s.length;
        for (int left = 0, right = n - 1; left < right; ++left, --right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }

}
