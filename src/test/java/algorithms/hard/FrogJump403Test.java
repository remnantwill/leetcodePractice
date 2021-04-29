package algorithms.hard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = FrogJump403.class)
@RunWith(SpringRunner.class)
public class FrogJump403Test {

    @Autowired
    private FrogJump403 instance;

    @Test
    public void canCrossTest() {
        int[] stones = {0, 1, 3, 5, 6, 8, 12, 17};
        boolean ans = instance.canCross(stones);
        System.out.println(ans);
    }
}
