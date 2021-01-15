package algorithms.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/most-stones-removed-with-same-row-or-column/
 */
public class MostStonesRemovedWithSameRowOrColumn947 {

    public int removeStones(int[][] stones) {
        UnionFind unionFind = new UnionFind();
        for (int[] stone : stones) {
            int x = stone[0];
            int y = stone[1];
            unionFind.union(x + 10001, y);
        }
        return stones.length - unionFind.getCount();
    }

    private static class UnionFind {
        private Map<Integer, Integer> parent;
        private int count;

        public UnionFind() {
            parent = new HashMap<>();
            count = 0;
        }

        public int getCount() {
            return count;
        }

        public int find(int x) {
            if (!parent.containsKey(x)) {
                parent.put(x, x);
                count++;
            }
            if (parent.get(x) != x) {
                parent.put(x, find(parent.get(x)));
            }
            return parent.get(x);
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            parent.put(rootX, rootY);
            count--;
        }
    }

}
