package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualLimit1438.class)
@RunWith(SpringRunner.class)
public class LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualLimit1438Test {

    @Autowired
    private LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualLimit1438 instance;

    @Test
    public void longestSubarrayIITest() {
        int[] nums = new int[]{8, 2, 4, 7};
        int limit = 4;
        int ans = instance.longestSubarrayII(nums, limit);
        System.out.println(ans);
    }
}
