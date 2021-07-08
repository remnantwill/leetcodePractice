package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = BinarySubarraysWithSum930.class)
@RunWith(SpringRunner.class)
public class BinarySubarraysWithSum930Test {

    @Autowired
    private BinarySubarraysWithSum930 instance;

    @Test
    public void numSubarraysWithSumTest() {
        int[] nums = { 1, 0, 1, 0, 1 };
        int goal = 2;
        int ans = instance.numSubarraysWithSum(nums, goal);
        System.out.println(ans);
    }

    @Test
    public void numSubarraysWithSumTestII() {
        int[] nums = { 1, 0, 1, 0, 1 };
        int goal = 2;
        int ans = instance.numSubarraysWithSumII(nums, goal);
        System.out.println(ans);
    }
}
