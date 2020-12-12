package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = WiggleSubsequence376.class)
@RunWith(SpringRunner.class)
public class WiggleSubsequence376Test {

    @Autowired
    private WiggleSubsequence376 instance;

    @Test
    public void wiggleMaxLengthTest() {
        int[] nums = new int[]{1, 7, 4, 9, 2, 5};
        int ans = instance.wiggleMaxLength(nums);
        System.out.println(ans);
    }

    @Test
    public void wiggleMaxLengthTestII() {
        int[] nums = new int[]{1, 7, 4, 9, 2, 5};
        int ans = instance.wiggleMaxLengthII(nums);
        System.out.println(ans);
    }

    @Test
    public void wiggleMaxLengthTestIII() {
        int[] nums = new int[]{1, 7, 4, 9, 2, 5};
        int ans = instance.wiggleMaxLengthIII(nums);
        System.out.println(ans);
    }
}
