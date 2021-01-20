package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MaximumProductOfThreeNumbers628.class)
@RunWith(SpringRunner.class)
public class MaximumProductOfThreeNumbers628Test {

    @Autowired
    private MaximumProductOfThreeNumbers628 instance;

    @Test
    public void maximumProductTest() {
//        int[] nums = new int[] { 1, 2, 3, 4 };
        int[] nums = new int[] { -100, -98, -1, 2, 3, 4 };
        int ans = instance.maximumProduct(nums);
        System.out.println(ans);
    }

    @Test
    public void maximumProductTestII() {
        int[] nums = new int[] { -100, -98, -1, 2, 3, 4 };
        int ans = instance.maximumProductII(nums);
        System.out.println(ans);
    }

}
