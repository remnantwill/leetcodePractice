package algorithms.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/jewels-and-stones/
 */
public class JewelsAndStones771 {

    /**
     * own solution modified from official solution #1
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStones(String J, String S) {
        Set<Character> jewelSet = new HashSet<>();
        int count = 0;
        for (int i = 0; i < J.length(); i++) {
            jewelSet.add(J.charAt(i));
        }
        for (int i = 0; i < S.length(); i++) {
            if (jewelSet.contains(S.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    /**
     * Violent solution
     * @param J
     * @param S
     * @return
     */
    public int numJewelsInStonesII(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            for (int j = 0; j < J.length(); j++) {
                if (c == J.charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

}
