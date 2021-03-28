package algorithms.medium;

import Bean.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/binary-search-tree-iterator/
 */
public class BinarySearchTreeIterator173 {
}

/**
 * solution I: flatten
 */
class BSTIterator {

    private int idx;
    private List<Integer> arr;

    public BSTIterator(TreeNode root) {
        idx = 0;
        arr = new ArrayList<>();
        inorderTraversal(root, arr);
    }

    private void inorderTraversal(TreeNode root, List<Integer> arr) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, arr);
        arr.add(root.val);
        inorderTraversal(root.right, arr);
    }

    public int next() {
        return arr.get(idx++);
    }

    public boolean hasNext() {
        return idx < arr.size();
    }
}


/**
 * solution II:
 */
class BSTIteratorII {

    private TreeNode cur;
    private Deque<TreeNode> stack;

    public BSTIteratorII(TreeNode root) {
        cur = root;
        stack = new LinkedList<>();
    }

    public int next() {
        while (cur != null) {
            stack.push(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        int ret = cur.val;
        cur = cur.right;
        return ret;
    }

    public boolean hasNext() {
        return cur != null || !stack.isEmpty();
    }
}