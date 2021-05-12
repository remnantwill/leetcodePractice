package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsInAStringIII557 {

    /**
     * solution I
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = s.length();
        int i = 0;
        while (i < length) {
            int start = i;
            while (i < length && s.charAt(i) != ' ') {
                i++;
            }
            for (int p = start; p < i; p++) {
                stringBuilder.append(s.charAt(start + i - p - 1));
            }
            while (i < length && s.charAt(i) == ' ') {
                i++;
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }

    /**
     * ownSolution (exceed time limit)
     * @param s
     * @return
     */
    public String reverseWordsOwn(String s) {
        String[] arr = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : arr) {
            char[] chars = str.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            while (left < right) {
                if (chars[left] == chars[right]) {
                    left++;
                    right--;
                    continue;
                }
                char tmp = chars[right];
                chars[right] = chars[left];
                chars[left] = tmp;
            }
            stringBuilder.append(chars);
        }
        return stringBuilder.toString();
    }

}
