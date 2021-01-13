package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/redundant-connection/
 */
public class RedundantConnection684 {

    public int[] findRedundantConnection(int[][] edges) {
        int length = edges.length;
        int[] parent = new int[length + 1];
        for (int i = 1; i <= length; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < length; i++) {
            int[] edge = edges[i];
            int index1 = edge[0];
            int index2 = edge[1];
            if (find(parent, index1) != find(parent, index2)) {
                union(parent, index1, index2);
            } else {
                return edge;
            }
        }
        return new int[0];
    }

    private void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }

    private int find(int[] parent, int index) {
        if (parent[index] != index) {
            parent[index] = parent[find(parent, parent[index])];
        }
        return parent[index];
    }

}
