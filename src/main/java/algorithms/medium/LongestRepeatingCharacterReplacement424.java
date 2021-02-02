package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/longest-repeating-character-replacement/
 */
public class LongestRepeatingCharacterReplacement424 {

    public int characterReplacement(String s, int k) {
        int len = s.length();
        if (len < 2) {
            return len;
        }
        int res = 0;
        int left = 0;
        int right = 0;
        int maxCount = 0;
        int[] freq = new int[26];
        char[] chars = s.toCharArray();
        while (right < len) {
            freq[chars[right] - 'A']++;
            maxCount = Math.max(maxCount, freq[chars[right] - 'A']);
            right++;
            if ((right - left) > maxCount + k) {
                freq[chars[left] - 'A']--;
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }

}
