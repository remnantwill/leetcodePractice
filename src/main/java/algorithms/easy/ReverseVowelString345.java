package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowelString345 {

    public String reverseVowels(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            while (i < n && !isVowel(chars[i])) {
                i++;
            }
            while (j > 0 && !isVowel(chars[j])) {
                j--;
            }
            if (i < j) {
                swap(chars, i, j);
                i++;
                j--;
            }
        }
        return String.valueOf(chars);
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) >= 0;
    }

}
