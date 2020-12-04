package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SplitArrayIntoConsecutiveSubsequences659.class)
@RunWith(SpringRunner.class)
public class SplitArrayIntoConsecutiveSubsequences659Test {

    @Autowired
    private SplitArrayIntoConsecutiveSubsequences659 instance;

    @Test
    public void isPossibleTest() {
        int[] nums = new int[] { 1, 2, 3, 3, 4, 4, 5, 5 };
        boolean ans = instance.isPossible(nums);
        System.out.println(ans);
    }

    @Test
    public void isPossibleTestII() {
        int[] nums = new int[] { 1, 2, 3, 3, 4, 4, 5, 5 };
        boolean ans = instance.isPossibleII(nums);
        System.out.println(ans);
    }
}
