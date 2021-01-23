package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/number-of-operations-to-make-network-connected/
 */
public class NumberOfOperationsToMakeNetworkConnected1319 {

    private List<Integer>[] edges;
    private boolean[] used;

    /**
     * solution I: dfs
     * @param n
     * @param connections
     * @return
     */
    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }
        edges = new List[n];
        for (int i = 0; i < n; i++) {
            edges[i] = new ArrayList<>();
        }
        used = new boolean[n];
        for (int[] connection : connections) {
            edges[connection[0]].add(connection[1]);
            edges[connection[1]].add(connection[0]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                dfs(i);
                ans++;
            }
        }
        return ans - 1;
    }

    private void dfs(int i) {
        used[i] = true;
        for (Integer v : edges[i]) {
            if (!used[v]) {
                dfs(v);
            }
        }
    }

    /**
     * solution II: union-find
     * @param n
     * @param connections
     * @return
     */
    public int makeConnectedII(int n, int[][] connections) {
        int m = connections.length;
        if (m < n - 1) {
            return -1;
        }
        UnionFind unionFind = new UnionFind(n);
        for (int[] connection : connections) {
            unionFind.union(connection[0], connection[1]);
        }
        return unionFind.setCount - 1;
    }

    private class UnionFind {
        int[] parent;
        int[] size;
        int n;
        int setCount;

        public UnionFind(int n) {
            this.n = n;
            setCount = n;
            parent = new int[n];
            size = new int[n];
            Arrays.fill(size, 1);
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            return parent[x] == x ? parent[x] : (parent[x] = find(parent[x]));
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
            size[rootX] += size[rootY];
            parent[rootY] = rootX;
            setCount--;
            return true;
        }

        public boolean connected(int x, int y) {
            return find(x) == find(y);
        }
    }

}
