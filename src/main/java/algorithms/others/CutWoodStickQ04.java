package algorithms.others;

/**
 * https://leetcode-cn.com/leetbook/read/interesting-algorithm-puzzles-for-programmers/90ach5/
 * https://leetcode-cn.com/circle/discuss/QGsghu/
 */
public class CutWoodStickQ04 {

    /**
     * solution I: Positive thinking
     * @param m
     * @param n
     * @return
     */
    public int cutBar(int m, int n) {
        int slices = 1;
        int cnt = 0;
        while (slices < n) {
            cnt++;
            slices += Math.min(slices, m);
        }
        return cnt;
    }

    /**
     * solution II: Reverse Thinking
     * @param m
     * @param n
     * @return
     */
    public int cutBarII(int m, int n) {
        int slices = n;
        int cnt = 0;
        while (slices > 1) {
            cnt++;
            slices -= Math.min(slices / 2, m);
        }
        return cnt;
    }
}
