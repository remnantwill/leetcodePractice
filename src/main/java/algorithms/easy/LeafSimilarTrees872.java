package algorithms.easy;

import Bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/leaf-similar-trees/
 */
public class LeafSimilarTrees872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        dfs(root1, list1);
        List<Integer> list2 = new ArrayList<>();
        dfs(root2, list2);
        return list1.equals(list2);
    }

    private void dfs(TreeNode node, List<Integer> list) {
        if (node.left == null && node.right == null) {
            list.add(node.val);
        } else {
            if (node.left != null) {
                dfs(node.left, list);
            }
            if (node.right != null) {
                dfs(node.right, list);
            }
        }
    }

}
