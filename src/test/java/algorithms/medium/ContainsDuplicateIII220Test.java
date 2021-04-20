package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ContainsDuplicateIII220.class)
@RunWith(SpringRunner.class)
public class ContainsDuplicateIII220Test {

    @Autowired
    private ContainsDuplicateIII220 instance;

    @Test
    public void containsNearbyAlmostDuplicateIITest() {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        int t = 0;
        boolean ans = instance.containsNearbyAlmostDuplicateII(nums, k, t);
        System.out.println(ans);
    }
}
