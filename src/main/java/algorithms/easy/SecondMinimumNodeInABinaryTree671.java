package algorithms.easy;

import Bean.TreeNode;

/**
 * https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/
 */
public class SecondMinimumNodeInABinaryTree671 {

    int ans;
    int rootVal;

    /**
     * solution I: dfs
     * @param root
     * @return
     */
    public int findSecondMinimumValue(TreeNode root) {
        ans = -1;
        rootVal = root.val;
        dfs(root);
        return ans;
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        if (ans != -1 && node.val >= ans) {
            return;
        }
        if (node.val > rootVal) {
            ans = node.val;
        }
        dfs(node.left);
        dfs(node.right);
    }

}
