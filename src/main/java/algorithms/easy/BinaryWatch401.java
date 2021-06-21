package algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-watch/
 */
public class BinaryWatch401 {

    /**
     * solution I: enumeration
     * @param turnedOn
     * @return
     */
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn) {
                    ans.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }
        return ans;
    }

    /**
     * solution II: enumeration 2
     * @param turnedOn
     * @return
     */
    public List<String> readBinaryWatchII(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < 1024; i++) {
            int h = i >> 6;
            int m = i & 63;
            if (h < 12 && m < 60 && Integer.bitCount(i) == turnedOn) {
                ans.add(h + ":" + (m < 10 ? "0" : "") + m);
            }
        }
        return ans;
    }

}
