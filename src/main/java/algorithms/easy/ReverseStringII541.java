package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/reverse-string-ii/
 */
public class ReverseStringII541 {

    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; i += 2 * k) {
            reverse(chars, i, Math.min(i +k, n) -1);
        }
        return new String(chars);
    }

    private void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
    }

}
