package algorithms.easy;

import Bean.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RangeSumBST938.class)
@RunWith(SpringRunner.class)
public class RangeSumBST938Test {

    @Autowired
    private RangeSumBST938 instance;

    @Test
    public void rangeSumBSTTest() {
        int low = 7, high = 15;
        TreeNode root = new TreeNode(10);
        TreeNode rootLeft = new TreeNode(5);
        TreeNode rootRight = new TreeNode(15);
        root.left = rootLeft;
        root.right = rootRight;
        TreeNode rtLtLeft = new TreeNode(3);
        TreeNode rtLtRight = new TreeNode(7);
        rootLeft.left = rtLtLeft;
        rootLeft.right = rtLtRight;
        TreeNode rtRtRight = new TreeNode(18);
        rootRight.left = null;
        rootRight.right = rtRtRight;
//        int ans = instance.rangeSumBST(root, low, high);
        int ans = instance.rangeSumBSTII(root, low, high);
        System.out.println(ans);
    }
}
