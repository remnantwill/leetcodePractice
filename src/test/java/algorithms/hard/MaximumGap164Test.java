package algorithms.hard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes = MaximumGap164.class)
@RunWith(SpringRunner.class)
public class MaximumGap164Test {

    @Autowired
    private MaximumGap164 instance;

    @Test
    public void maximumGapTest() {
        int[] nums = new int[] {3,6,9,1};
        int ans = instance.maximumGap(nums);
        System.out.println(ans);
    }

    @Test
    public void maximumGapIITest() {
        int[] nums = new int[] {3,6,9,1};
        int ans = instance.maximumGapII(nums);
        System.out.println(ans);
    }
}
