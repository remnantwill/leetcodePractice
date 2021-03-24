package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = One32Pattern456.class)
@RunWith(SpringRunner.class)
public class One32Pattern456Test {

    @Autowired
    private One32Pattern456 instance;

    @Test
    public void find132patternTest() {
        int[] nums = new int[] { 3, 1, 4, 2 };
        boolean ans = instance.find132pattern(nums);
        System.out.println(ans);
    }

    @Test
    public void find132patternTestII() {
        int[] nums = new int[] { 3, 1, 4, 2 };
        boolean ans = instance.find132patternII(nums);
        System.out.println(ans);
    }

    @Test
    public void find132patternTestIII() {
        int[] nums = new int[] { 3, 1, 4, 2 };
        boolean ans = instance.find132patternIII(nums);
        System.out.println(ans);
    }
}
