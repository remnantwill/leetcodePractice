package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 */
public class RemoveAllAdjacentDuplicatesInString1047 {

    public String removeDuplicates(String S) {
        StringBuilder stack = new StringBuilder();
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (top >= 0 && c == stack.charAt(top)) {
                stack.deleteCharAt(top);
                --top;
            } else {
                stack.append(c);
                ++top;
            }
        }
        return stack.toString();
    }

}
