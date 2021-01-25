package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/regions-cut-by-slashes/
 */
public class RegionsCutBySlashes959 {
    public int regionsBySlashes(String[] grid) {
        int N = grid.length;
        int size = 4 * N * N;
        UnionFind uf = new UnionFind(size);
        for (int i = 0; i < N; i++) {
            char[] chars = grid[i].toCharArray();
            for (int j = 0; j < N; j++) {
                int index = 4 * (i * N + j);
                char c = chars[j];
                if (c == '/') {
                    uf.union(index, index + 3);
                    uf.union(index + 1, index + 2);
                } else if (c == '\\') {
                    uf.union(index, index + 1);
                    uf.union(index + 2, index + 3);
                } else {
                    uf.union(index, index + 1);
                    uf.union(index + 1, index + 2);
                    uf.union(index + 2, index + 3);
                }
                if (j + 1 < N) {
                    uf.union(index + 1, 4 * (i * N + j + 1) + 3);
                }
                if (i + 1 < N) {
                    uf.union(index + 2, 4 * ((i + 1) * N + j));
                }
            }
        }
        return uf.getCount();
    }

    private class UnionFind {
        int parent[];
        int count;
        int n;

        public int getCount() {
            return count;
        }
        public UnionFind(int n) {
            this.n = n;
            count = n;
            parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }
        public int find(int x) {
            while (x != parent[x]) {
                parent[x] = parent[parent[x]];
                x = parent[x];
            }
            return x;
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return;
            }
            parent[rootX] = rootY;
            --count;
        }
    }

}
