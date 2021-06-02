package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ContinuousSubarraySum523.class)
@RunWith(SpringRunner.class)
public class ContinuousSubarraySum523Test {

    @Autowired
    private ContinuousSubarraySum523 instance;

    @Test
    public void checkSubarraySumTest() {
        int[] nums = new int[] { 23, 2, 4, 6, 7 };
        int k = 6;
        boolean ans = instance.checkSubarraySum(nums, k);
        System.out.println(ans);
    }
}
