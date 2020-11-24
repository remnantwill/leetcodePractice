package algorithms.medium;

import Bean.TreeNode;

/**
 * https://leetcode-cn.com/problems/count-complete-tree-nodes/
 */
public class CountCompleteTreeNodes222 {

    /**
     * solution I: Binary search + bit operation
     * @param root
     * @return
     */
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int level = 0;
        TreeNode node = root;
        while (node.left != null) {
            level++;
            node = node.left;
        }
        int low = 1 << level;
        int high = (1 << (level + 1)) - 1;
        while (low < high) {
            int mid = (high - low + 1) / 2 + low;
            if (exist(root, level, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private boolean exist(TreeNode root, int level, int mid) {
        int bits = 1 << (level - 1);
        TreeNode node = root;
        while (node != null && bits > 0) {
            if ((bits & mid) == 0) {
                node = node.left;
            } else {
                node = node.right;
            }
            bits >>= 1;
        }
        return node != null;
    }

    int count = 0;
    /**
     * own solution: dfs
     * @param root
     * @return
     */
    public int countNodesOwn(TreeNode root) {
        if (root == null) {
            return 0;
        }
        count = 1;
        TreeNode node = root;
        dfs(node);

        return count;
    }

    private void dfs(TreeNode node) {
        if (node.left != null) {
            ++count;
            dfs(node.left);
        }
        if (node.right != null) {
            ++count;
            dfs(node.right);
        }
    }

}
