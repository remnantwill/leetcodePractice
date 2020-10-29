package algorithms.medium;

import Bean.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SumRootToLeafNumbers129.class)
@RunWith(SpringRunner.class)
public class SumRootToLeafNumbers129Test {

    @Autowired
    SumRootToLeafNumbers129 instance;

    @Test
    public void sumNumbersTest() {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(0);
//        int res = instance.sumNumbers(root);
        int res = instance.sumNumbersII(root);
        System.out.println(res);
    }

}
