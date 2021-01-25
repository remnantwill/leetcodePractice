package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = LongestContinuousIncreasingSubsequence674.class)
@RunWith(SpringRunner.class)
public class LongestContinuousIncreasingSubsequence674Test {

    @Autowired
    private LongestContinuousIncreasingSubsequence674 instance;

    @Test
    public void findLengthOfLCISTest() {
//        int[] nums = new int[] { 1, 3, 5, 4, 7 };
//        int[] nums = new int[] { 1, 3, 5, 4, 7, 1, 3, 5, 7 };
        int[] nums = new int[] { 1, 3, 2, 4, 6, 8, 1, 2, 3  };
        int ans = instance.findLengthOfLCIS(nums);
        System.out.println(ans);
    }
}
