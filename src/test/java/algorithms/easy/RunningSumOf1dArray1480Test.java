package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = RunningSumOf1dArray1480.class)
@RunWith(SpringRunner.class)
public class RunningSumOf1dArray1480Test {

    @Resource
    private RunningSumOf1dArray1480 instance;

    @Test
    public void runningSumTest() {
//        int[] nums = { 1, 2, 3, 4 };
//        int[] nums = { 1,1,1,1,1 };
        int[] nums = { 3,1,2,10,1 };
        int[] ans = instance.runningSum(nums);
        for (int num : ans) {
            System.out.println(num);
        }
    }
}
