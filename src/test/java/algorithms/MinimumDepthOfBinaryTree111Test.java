package algorithms;

import Bean.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MinimumDepthOfBinaryTree111.class)
@RunWith(SpringRunner.class)
class MinimumDepthOfBinaryTree111Test {

    @Autowired
    private MinimumDepthOfBinaryTree111 minimumDepthOfBinaryTree111;

    @Test
    void testMinimumDepthOfBinaryTree111() {
        String str = "[3,9,20,null,null,15,7]";

        TreeNode treeNode = TreeNode.mkTree(str);

        int minDepth = minimumDepthOfBinaryTree111.minDepth(treeNode);
        System.out.println(String.format("The min depth is %s", minDepth));
    }

}
