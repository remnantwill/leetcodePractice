package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = SumOfAllOddLengthSubarrays1588.class)
@RunWith(SpringRunner.class)
public class SumOfAllOddLengthSubarrays1588Test {

    @Resource
    private SumOfAllOddLengthSubarrays1588 instance;

    @Test
    public void sumOddLengthSubarraysTest() {
        int[] arr = new int[] { 1, 4, 2, 5, 3 };
        int ans = instance.sumOddLengthSubarrays(arr);
        System.out.println(ans);
    }

    @Test
    public void sumOddLengthSubarraysTestII() {
        int[] arr = new int[] { 1, 4, 2, 5, 3 };
        int ans = instance.sumOddLengthSubarraysII(arr);
        System.out.println(ans);
    }

    @Test
    public void sumOddLengthSubarraysTestIII() {
        int[] arr = new int[] { 1, 4, 2, 5, 3 };
        int ans = instance.sumOddLengthSubarraysIII(arr);
        System.out.println(ans);
    }
}
