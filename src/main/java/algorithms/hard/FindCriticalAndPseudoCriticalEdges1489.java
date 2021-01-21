package algorithms.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-critical-and-pseudo-critical-edges-in-minimum-spanning-tree/
 */
public class FindCriticalAndPseudoCriticalEdges1489 {

    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        int m = edges.length;
        int[][] newEdges = new int[m][4];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 3; j++) {
                newEdges[i][j] = edges[i][j];
            }
            newEdges[i][3] = i;
        }
        Arrays.sort(edges, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        UnionFind ufStd = new UnionFind(n);
        int value = 0;
        for (int i = 0; i < m; i++) {
            if (ufStd.union(newEdges[i][0], newEdges[i][1])) {
                value += newEdges[i][2];
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ans.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            UnionFind uf = new UnionFind(n);
            int v = 0;
            for (int j = 0; j < m; j++) {
                if (i != j && uf.union(newEdges[j][0], newEdges[j][1])) {
                    v += newEdges[j][2];
                }
            }
            if (uf.setCount != 1 || (uf.setCount == 1 && v > value)) {
                ans.get(0).add(newEdges[i][3]);
                continue;
            }
            uf = new UnionFind(n);
            uf.union(newEdges[i][0], newEdges[i][1]);
            v = newEdges[i][2];
            for (int j = 0; j < m; j++) {
                if (i != j && uf.union(newEdges[j][0], newEdges[j][1])) {
                    v += newEdges[j][2];
                }
            }
            if (v == value) {
                ans.get(1).add(newEdges[i][3]);
            }
        }
        return ans;
    }


    private class UnionFind {
        int n;
        int[] parent;
        int[] size;
        int setCount;

        public UnionFind(int n) {
            this.n = n;
            this.setCount = n;
            parent = new int[n];
            size = new int[n];
            Arrays.fill(size, 1);
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] == x) {
                return parent[x];
            }
            return find(parent[x]);
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
            if (find(x) == find(y)) {
                return true;
            }
            return false;
        }
    }
}


