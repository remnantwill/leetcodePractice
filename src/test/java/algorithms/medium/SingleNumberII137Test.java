package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SingleNumberII137.class)
@RunWith(SpringRunner.class)
public class SingleNumberII137Test {

    @Autowired
    private SingleNumberII137 instance;

    @Test
    public void singleNumberIITest() {
        int[] nums = new int[]{2, 2, 3, 2};
        int ans = instance.singleNumberII(nums);
        System.out.println(ans);
    }
}
