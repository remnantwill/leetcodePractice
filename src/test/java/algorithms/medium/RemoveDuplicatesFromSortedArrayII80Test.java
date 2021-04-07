package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RemoveDuplicatesFromSortedArrayII80.class)
@RunWith(SpringRunner.class)
public class RemoveDuplicatesFromSortedArrayII80Test {

    @Autowired
    private RemoveDuplicatesFromSortedArrayII80 instance;

    @Test
    public void removeDuplicatesTest() {
        int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
        int ans = instance.removeDuplicates(nums);
        System.out.println(ans);
    }
}
