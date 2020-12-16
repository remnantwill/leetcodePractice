package algorithms.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/word-pattern/
 */
public class WordPattern290 {

    public boolean wordPattern(String pattern, String s) {
        Map<String, Character> str2Ch = new HashMap<>();
        Map<Character, String> ch2Str = new HashMap<>();
        int m = s.length();
        int i = 0;
        for (int p = 0; p < pattern.length(); p++) {
            if (i >= m) {
                return false;
            }
            char ch = pattern.charAt(p);
            int j = i;
            while (j < m && s.charAt(j) != ' ') {
                ++j;
            }
            String tmp = s.substring(i, j);
            if (str2Ch.containsKey(tmp) && str2Ch.get(tmp) != (ch)) {
                return false;
            }
            if (ch2Str.containsKey(ch) && !ch2Str.get(ch).equals(tmp)) {
                return false;
            }
            str2Ch.put(tmp, ch);
            ch2Str.put(ch, tmp);
            i = j + 1;
        }
        return i >= m;
    }

}
