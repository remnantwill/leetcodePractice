package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MoveZeroes283.class)
@RunWith(SpringRunner.class)
public class MoveZeroes283Test {

    @Autowired
    private MoveZeroes283 instance;

    @Test
    public void moveZeroesTest() {
        int[] nums = { 0, 1, 0, 3, 12 };
        instance.moveZeroes(nums);
        System.out.println(CommonUtil.printArrayInLine(nums));
    }


}
