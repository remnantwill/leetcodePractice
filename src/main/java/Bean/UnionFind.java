package Bean;

import java.util.Arrays;

public class UnionFind {
    int[] parent;
    int[] size;
    int n;
    // 当前连通分量数目
    int setCount;
    public UnionFind(int n) {
        this.n = n;
        this.setCount = n;
        this.parent = new int[n];
        this.size = new int[n];
        Arrays.fill(size, 1);
        for (int i = 0; i < n; ++i) {
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
            int temp = rootX;
            rootX = rootY;
            rootY = temp;
        }
        parent[rootY] = rootX;
        size[rootX] += size[rootY];
        --setCount;
        return true;
    }
    public boolean connected(int x, int y) {
        x = find(x);
        y = find(y);
        return x == y;
    }

    public int getSetCount() {
        return setCount;
    }
}
