package algorithms.medium;

import Bean.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-tree-preorder-traversal/
 */
public class BinaryTreePreorderTraversal144 {

    /**
     * own solution: recursive (modified based on solution I)
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        recursive(ans, root);
        return ans;
    }

    private void recursive(List<Integer> ans, TreeNode node) {
        if (node == null) {
            return;
        }
        ans.add(node.val);
        recursive(ans, node.left);
        recursive(ans, node.right);
    }

    /**
     * solution II: queue
     * @param root
     * @return
     */
    public List<Integer> preorderTraversalII(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                ans.add(node.val);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return ans;
    }

    /**
     * solution III: Morris Traversal
     * @param root
     * @return
     */
    public List<Integer> preorderTraversalIII(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        TreeNode p1 = root, p2 = null;
        while (p1 != null) {
            p2 = p1.left;
            if (p2 != null) {
                while (p2.right != null && p2.right != p1) {
                    p2 = p2.right;
                }
                if (p2.right == null) {
                    ans.add(p1.val);
                    p2.right = p1;
                    p1 = p1.left;
                    continue;
                } else {
                    p2.right = null;
                }
            } else {
                ans.add(p1.val);
            }
            p1 = p1.right;
        }
        return ans;
    }
}
