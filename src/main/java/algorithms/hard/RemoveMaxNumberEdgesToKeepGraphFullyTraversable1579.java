package algorithms.hard;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/remove-max-number-of-edges-to-keep-graph-fully-traversable/
 */
public class RemoveMaxNumberEdgesToKeepGraphFullyTraversable1579 {

    public int maxNumEdgesToRemove(int n, int[][] edges) {
        UnionFind ufa = new UnionFind(n);
        UnionFind ufb = new UnionFind(n);
        int ans = 0;
        for (int[] edge : edges) {
            --edge[1];
            --edge[2];
        }
        for (int[] edge : edges) {
            if (edge[0] == 3) {
                if (!ufa.union(edge[1], edge[2])) {
                    ans++;
                } else {
                    ufb.union(edge[1], edge[2]);
                }
            }
        }
        for (int[] edge : edges) {
            if (edge[0] == 1) {
                if (!ufa.union(edge[1], edge[2])) {
                    ans++;
                }
            }
            if (edge[0] == 2) {
                if (!ufb.union(edge[1], edge[2])) {
                    ans++;
                }
            }
        }
        if (ufa.setCount != 1 || ufb.setCount != 1) {
            return -1;
        }
        return ans;
    }

    private class UnionFind {
        int n;
        int[] size;
        int[] parent;
        int setCount;
        public UnionFind(int n) {
            this.n = n;
            this.setCount = n;
            size = new int[n];
            parent = new int[n];
            Arrays.fill(size, 1);
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }
        public int find(int x) {
            return parent[x] == x ? x : (parent[x] = find(parent[x]));
        }
        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return false;
            }
            if (size[rootX] < size[rootY]) {
                int tmp = rootX;
                rootX = rootY;
                rootY = tmp;
            }
            parent[rootY] = rootX;
            size[rootX] += size[rootY];
            setCount--;
            return true;
        }
        public boolean connected(int x, int y) {
            return find(x) == find(y);
        }
    }

}
