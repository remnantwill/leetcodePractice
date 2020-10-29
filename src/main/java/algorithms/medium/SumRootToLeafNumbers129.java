package algorithms.medium;

import Bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/
 */
public class SumRootToLeafNumbers129 {

    /**
     * solution I: dfs
     * @param root
     * @return
     */
    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }
    private int dfs(TreeNode root, int prevSum) {
        if (root == null) {
            return 0;
        }
        prevSum = prevSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return prevSum;
        } else {
            return dfs(root.left, prevSum) + dfs(root.right, prevSum);
        }
    }

    /**
     * solution II: bfs
     * @param root
     * @return
     */
    public int sumNumbersII(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> numQueue = new LinkedList<>();
        nodeQueue.offer(root);
        numQueue.offer(root.val);
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            Integer num = numQueue.poll();
            TreeNode left = node.left;
            TreeNode right = node.right;
            if (left == null && right == null) {
                sum += num;
            } else {
                if (left != null) {
                    nodeQueue.offer(left);
                    numQueue.offer(num * 10 + left.val);
                }
                if (right != null) {
                    nodeQueue.offer(right);
                    numQueue.offer(num * 10 + right.val);
                }
            }
        }

        return sum;
    }

}
