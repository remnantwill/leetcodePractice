package algorithms.easy;

import Bean.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/cousins-in-binary-tree/
 */
public class CousinsInBinaryTree993 {

    int x;
    int xDepth;
    TreeNode xParent;
    boolean xFound;

    int y;
    int yDepth;
    TreeNode yParent;
    boolean yFound;

    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        dfs(root, null, 0);
        return xDepth == yDepth && xParent != yParent;
    }

    private void dfs(TreeNode node, TreeNode parentNode, int depth) {
        if (node == null) {
            return;
        }
        if (node.val == x) {
            xDepth = depth;
            xParent = parentNode;
            xFound = true;
        } else if (node.val == y) {
            yDepth = depth;
            yParent = parentNode;
            yFound = true;
        }
        if (xFound && yFound) {
            return;
        }
        dfs(node.left, node, depth + 1);
        if (xFound && yFound) {
            return;
        }
        dfs(node.right, node, depth + 1);
    }

    /**
     * solution II: bfs
     * @param root
     * @param x
     * @param y
     * @return
     */
    public boolean isCousinsII(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> depthQueue = new LinkedList<>();
        nodeQueue.offer(root);
        depthQueue.offer(0);
        update(root, null, 0);
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            Integer depth = depthQueue.poll();
            if (node.left != null) {
                nodeQueue.offer(node.left);
                depthQueue.offer(depth + 1);
                update(node.left, node, depth + 1);
            }
            if (node.right != null) {
                nodeQueue.offer(node.right);
                depthQueue.offer(depth + 1);
                update(node.right, node, depth + 1);
            }
            if (xFound && yFound) {
                break;
            }
        }
        return xDepth == yDepth && xParent != yParent;
    }

    private void update(TreeNode node, TreeNode parent, int depth) {
        if (node.val == x) {
            xFound = true;
            xParent = parent;
            xDepth = depth;
        }
        if (node.val == y) {
            yFound = true;
            yParent = parent;
            yDepth = depth;
        }
    }

}
