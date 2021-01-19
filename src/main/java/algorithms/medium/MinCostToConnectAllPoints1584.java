package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/min-cost-to-connect-all-points/
 */
public class MinCostToConnectAllPoints1584 {

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<Edge> edges = new ArrayList<>();
        UnionFind uf = new UnionFind(n);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                edges.add(new Edge(dist(points, i, j), i, j));
            }
        }
        Collections.sort(edges, Comparator.comparing(edge -> edge.length));
        int ret = 0, nums = 1;
        for (Edge edge : edges) {
            int length = edge.length;
            int x = edge.x;
            int y = edge.y;
            if (uf.union(x, y)) {
                ret += length;
                nums++;
                if (nums == n) {
                    break;
                }
            }
        }
        return ret;
    }

    private int dist(int[][] points, int x, int y) {
        return Math.abs(points[x][0] - points[y][0]) + Math.abs(points[x][1] - points[y][1]);
    }

    private class UnionFind {
        int n;
        int[] rank;
        int[] parent;

        public UnionFind(int n) {
            this.n = n;
            rank = new int[n];
            parent = new int[n];
            Arrays.fill(rank, 1);
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
            if (rank[rootX] < rank[rootY]) {
                int temp = rootX;
                rootX = rootY;
                rootY = temp;
            }
            rank[rootX] += rank[rootY];
            parent[rootY] = rootX;
            return true;
        }
    }

}

class Edge {
    int length;
    int x;
    int y;

    public Edge(int length, int x, int y) {
        this.length = length;
        this.x = x;
        this.y = y;
    }
}
