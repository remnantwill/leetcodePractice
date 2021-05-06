package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DeleteAndEarn740.class)
@RunWith(SpringRunner.class)
public class DeleteAndEarn740Test {

    @Autowired
    private DeleteAndEarn740 instance;

    @Test
    public void deleteAndEarnTest() {
        int[] nums = new int[]{2,2,3,3,3,4};
        int ans = instance.deleteAndEarn(nums);
        System.out.println(ans);
    }

    @Test
    public void deleteAndEarnTestII() {
        int[] nums = new int[]{2,2,3,3,3,4};
        int ans = instance.deleteAndEarnII(nums);
        System.out.println(ans);
    }
}
