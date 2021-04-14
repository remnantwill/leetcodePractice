package algorithms.easy;

import Bean.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MinimumDistanceBetweenBSTNodes783.class)
@RunWith(SpringRunner.class)
public class MinimumDistanceBetweenBSTNodes783Test {

    @Autowired
    private MinimumDistanceBetweenBSTNodes783 instance;

    @Test
    public void minDiffInBSTTest() {
        TreeNode root = new TreeNode(4);
        TreeNode rootLeft = new TreeNode(2);
        TreeNode rootRight = new TreeNode(6);
        root.left = rootLeft;
        root.right = rootRight;
        TreeNode rootLeftL = new TreeNode(1);
        TreeNode rootLeftR = new TreeNode(3);
        rootLeft.left = rootLeftL;
        rootLeft.right = rootLeftR;

        instance.minDiffInBST(root);
    }
}
