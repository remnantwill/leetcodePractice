package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CombinationSumIV377.class)
@RunWith(SpringRunner.class)
public class CombinationSumIV377Test {

    @Autowired
    private CombinationSumIV377 instance;

    @Test
    public void combinationSum4Test() {
        int[] nums = {1, 2, 3};
        int target = 4;
        instance.combinationSum4(nums, target);
    }
}
