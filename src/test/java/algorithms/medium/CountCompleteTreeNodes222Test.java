package algorithms.medium;

import Bean.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CountCompleteTreeNodes222.class)
@RunWith(SpringRunner.class)
public class CountCompleteTreeNodes222Test {

    @Autowired
    private CountCompleteTreeNodes222 instance;

    @Test
    public void countNodesTest() {
        TreeNode root = new TreeNode(1);
        TreeNode rootLeft = new TreeNode(2);
        TreeNode rootRight = new TreeNode(3);
        TreeNode leftLeft = new TreeNode(4);
        TreeNode leftRight = new TreeNode(5);
        TreeNode rightLeft = new TreeNode(6);
        root.left = rootLeft; root.right = rootRight;
        rootLeft.left = leftLeft; rootLeft.right = leftRight;
        rootRight.left = rightLeft;
        int ans = instance.countNodes(root);
        System.out.println(ans);
    }
}
