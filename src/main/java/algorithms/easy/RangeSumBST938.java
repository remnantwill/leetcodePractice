package algorithms.easy;

import Bean.TreeNode;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/range-sum-of-bst/
 */
public class RangeSumBST938 {

    private int sum;

    /**
     * own solution: dfs
     * @param root
     * @param low
     * @param high
     * @return
     */
    public int rangeSumBST(TreeNode root, int low, int high) {
        inorder(root, low, high);
        return sum;
    }

    private void inorder(TreeNode node, int low, int high) {
        if (node == null) {
            return;
        }
        inorder(node.left, low, high);
        if (node.val >= low && node.val <= high) {
            sum += node.val;
        }
        inorder(node.right, low, high);
    }

    /**
     * solution I: dfs
     * @param root
     * @param low
     * @param high
     * @return
     */
    public int rangeSumBSTII(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val > high) {
            return rangeSumBSTII(root.left, low, high);
        }
        if (root.val < low) {
            return rangeSumBSTII(root.right, low, high);
        }
        return root.val + rangeSumBSTII(root.left, low, high) + rangeSumBSTII(root.right, low, high);
    }

    /**
     * solution II: bfs
     * @param root
     * @param low
     * @param high
     * @return
     */
    public int rangeSumBSTIII(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                continue;
            }
            if (node.val > high) {
                queue.offer(node.left);
            } else if (node.val < low) {
                queue.offer(node.right);
            } else {
                sum += node.val;
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return sum;
    }

}
