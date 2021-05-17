package algorithms.easy;

import Bean.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CousinsInBinaryTree993.class)
@RunWith(SpringRunner.class)
public class CousinsInBinaryTree993Test {

    @Autowired
    private CousinsInBinaryTree993 instance;

    @Test
    public void isCousinsTest() {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.left.right = new TreeNode(4);
//        root.right = new TreeNode(3);
//        root.right.right = new TreeNode(5);
//        int x = 5, y = 4;
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        int x = 2, y = 3;
        boolean ans = instance.isCousins(root, x, y);
        System.out.println(ans);
    }
}
