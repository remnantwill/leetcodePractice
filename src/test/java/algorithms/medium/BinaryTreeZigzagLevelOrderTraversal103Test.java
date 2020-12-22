package algorithms.medium;

import Bean.TreeNode;
import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = BinaryTreeZigzagLevelOrderTraversal103.class)
@RunWith(SpringRunner.class)
public class BinaryTreeZigzagLevelOrderTraversal103Test {

    @Autowired
    private BinaryTreeZigzagLevelOrderTraversal103 instance;

    @Test
    public void zigzagLevelOrderTest() {
        TreeNode root = new TreeNode(3);
        TreeNode rootLeft = new TreeNode(9);
        TreeNode rootRight = new TreeNode(20);
        root.left = rootLeft;
        root.right = rootRight;
        TreeNode leftLeft = new TreeNode(18);
        TreeNode leftRight = new TreeNode(6);
        rootLeft.left = leftLeft;
        rootLeft.right = leftRight;
        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);
        rootRight.left = rightLeft;
        rootRight.right = rightRight;
        List<List<Integer>> ans = instance.zigzagLevelOrder(root);
        for (List<Integer> an : ans) {
            String s = CommonUtil.printListInLine(an);
            System.out.println(s);
        }
    }
}
