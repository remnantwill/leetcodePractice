package algorithms.easy;

import Bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/increasing-order-search-tree/
 */
public class IncreasingOrderSearchTree897 {

    /**
     * solution I: Generate a new tree after in-order traversal
     * @param root
     * @return
     */
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        TreeNode dummy = new TreeNode(-1);
        TreeNode currNode = dummy;
        for (Integer value : res) {
            currNode.right = new TreeNode(value);
            currNode = currNode.right;
        }
        return dummy.right;
    }

    private void inorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }

    private TreeNode resNode;

    /**
     * solution II: modify node's sequence during the in-order traversal
     * @param root
     * @return
     */
    public TreeNode increasingBSTII(TreeNode root) {
        TreeNode dummyNode = new TreeNode(-1);
        resNode = dummyNode;
        inorder(root);
        return dummyNode.right;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        resNode.right = node;
        node.left = null;
        resNode = node;
        inorder(node.right);
    }

}
