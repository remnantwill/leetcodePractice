package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RotateArray189.class)
@RunWith(SpringRunner.class)
public class RotateArray189Test {

    @Autowired
    private RotateArray189 instance;

    @Test
    public void rotateTest() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        instance.rotate(nums, k);
    }
}
