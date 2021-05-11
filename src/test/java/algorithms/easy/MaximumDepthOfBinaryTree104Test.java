package algorithms.easy;

import Bean.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MaximumDepthOfBinaryTree104.class)
@RunWith(SpringRunner.class)
public class MaximumDepthOfBinaryTree104Test {

    @Autowired
    private MaximumDepthOfBinaryTree104 instance;

    @Test
    public void maxDepthTest() {
        TreeNode root = new TreeNode(3);
        TreeNode rootLt = new TreeNode(9);
        TreeNode rootRt = new TreeNode(20);
        root.left = rootLt;
        root.right = rootRt;
        TreeNode rtRtLt = new TreeNode(15);
        TreeNode rtRtRt = new TreeNode(7);
        rootRt.left = rtRtLt;
        rootRt.right = rtRtRt;
        int ans = instance.maxDepth(root);
        System.out.println(ans);
    }
}
