package algorithms.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/assign-cookies/
 */
public class AssignCookies455 {

    /**
     * official solution: sort + greedy
     * @param g
     * @param s
     * @return
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int numOfChildren = g.length;
        int numOfCookies = s.length;
        int count = 0;
        for (int i = 0, j = 0; i < numOfChildren && j < numOfCookies; i++, j++) {
            while (j < numOfCookies && g[i] > s[j]) {
                j++;
            }
            if (j < numOfCookies) {
                count++;
            }
        }
        return count;
    }

    /**
     * own solution
     * @param g
     * @param s
     * @return
     */
    public int findContentChildrenOwn(int[] g, int[] s) {
        int cnt = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) >= g[i]) {
                    ++cnt;
                    list.remove(j);
                    break;
                }
            }
        }
        return cnt;
    }

}
