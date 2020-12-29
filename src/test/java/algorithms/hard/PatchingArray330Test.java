package algorithms.hard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = PatchingArray330.class)
@RunWith(SpringRunner.class)
public class PatchingArray330Test {

    @Autowired
    private PatchingArray330 instance;

    @Test
    public void minPatchesTest() {
//        int[] nums = new int[] { 1, 3 };
//        int n = 6;
        int[] nums = new int[] { 1, 2, 31, 33 };
        int n = 2147483647;
        int ans = instance.minPatches(nums, n);
        System.out.println(ans);
    }
}
