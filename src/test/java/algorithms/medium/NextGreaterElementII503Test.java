package algorithms.medium;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = NextGreaterElementII503.class)
@RunWith(SpringRunner.class)
public class NextGreaterElementII503Test {

    @Autowired
    private NextGreaterElementII503 instance;

    @Test
    public void nextGreaterElementsTest() {
        int[] nums = new int[] { 1, 2, 1 };
        int[] ans = instance.nextGreaterElements(nums);
        System.out.println(CommonUtil.printArrayInLine(ans));
    }
}
