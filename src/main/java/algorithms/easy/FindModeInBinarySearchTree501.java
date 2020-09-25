package algorithms.easy;

import Bean.TreeNode;
import org.omg.CORBA.BAD_CONTEXT;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/
 */
public class FindModeInBinarySearchTree501 {

    int base, count, maxCount;
    List<Integer> answers = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        TreeNode cur = root, pre = null;
        while (cur != null) {
            if (cur.left == null) {
                update(cur.val);
                cur = cur.right;
                continue;
            }
            pre = cur.left;
            while (pre.right != null && pre.right != cur) {
                pre = pre.right;
            }
            if (pre.right == null) {
                pre.right = cur;
                cur = cur.left;
            } else {
                pre.right = null;
                update(cur.val);
                cur = cur.right;
            }
        }
        int[] mode = new int[answers.size()];
        for (int i = 0; i < answers.size(); ++i) {
            mode[i] = answers.get(i);
        }
        return mode;
    }

    private void update(int x) {
        if (x == base) {
            ++count;
        } else {
            base = x;
            count = 1;
        }
        if (count == maxCount) {
            answers.add(base);
        } else if (count > maxCount) {
            maxCount = count;
            answers.clear();
            answers.add(base);
        }
    }
}