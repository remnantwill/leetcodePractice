package algorithms.hard;

import Bean.UnionFind;

/**
 * https://leetcode-cn.com/problems/couples-holding-hands/
 */
public class CouplesHoldingHands765 {

    public int minSwapsCouples(int[] row) {
        int len = row.length;
        int N = len / 2;
        UnionFind unionFind = new UnionFind(N);
        for (int i = 0; i < len; i += 2) {
            unionFind.union(row[i] / 2, row[i + 1] / 2);
        }
        return N - unionFind.getSetCount();
    }

}
