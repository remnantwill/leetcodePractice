package algorithms.easy;

import Bean.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@SpringBootTest(classes = FindModeInBinarySearchTree501.class)
@RunWith(SpringRunner.class)
class FindModeInBinarySearchTree501Test {

    @Autowired
    private FindModeInBinarySearchTree501 findModeInBinarySearchTree501;

    @Test
    void testRepeatedSubstringPattern() {
        Integer[] array = { 1, null, 2, null, null, 2, null };
        TreeNode input = TreeNode.makeTree(array);
        int[] result = findModeInBinarySearchTree501.findMode(input);
        System.out.println(Arrays.toString(result));
    }
}
