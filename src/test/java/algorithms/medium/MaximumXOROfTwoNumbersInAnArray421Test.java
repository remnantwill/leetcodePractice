package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MaximumXOROfTwoNumbersInAnArray421.class)
@RunWith(SpringRunner.class)
public class MaximumXOROfTwoNumbersInAnArray421Test {

    @Autowired
    private MaximumXOROfTwoNumbersInAnArray421 instance;

    @Test
    public void findMaximumXORTest() {
        int[] nums = new int[] { 3, 10, 5, 25, 2, 8 };
        int ans = instance.findMaximumXOR(nums);
        System.out.println(ans);
    }

    @Test
    public void findMaximumXORTestII() {
        int[] nums = new int[] { 3, 10, 5, 25, 2, 8 };
        int ans = instance.findMaximumXORII(nums);
        System.out.println(ans);
    }
}
