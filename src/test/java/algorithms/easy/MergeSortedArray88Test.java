package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MergeSortedArray88.class)
@RunWith(SpringRunner.class)
public class MergeSortedArray88Test {

    @Autowired
    private MergeSortedArray88 instance;

    @Test
    public void mergeTest() {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        int m = 3;
        int n = 3;
        instance.merge(nums1, m, nums2, n);
    }

    @Test
    public void mergeTestII() {
        int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = new int[] { 2, 5, 6 };
        int m = 3;
        int n = 3;
        instance.mergeII(nums1, m, nums2, n);
    }
}
