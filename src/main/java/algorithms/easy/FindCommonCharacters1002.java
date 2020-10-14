package algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-common-characters/
 */
public class FindCommonCharacters1002 {

    public List<String> commonChars(String[] A) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for (String word : A) {
            int length = word.length();
            int[] freq = new int[26];
            for (int i = 0; i < length; i++) {
                char c = word.charAt(i);
                ++freq[c - 'a'];
            }
            for (int i = 0; i < 26; i++) {
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < minfreq[i]; j++) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }

}
