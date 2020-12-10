package algorithms.medium;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = FindFirstAndLastPositionOfElementInSortedArray34.class)
@RunWith(SpringRunner.class)
public class FindFirstAndLastPositionOfElementInSortedArray34Test {

    @Autowired
    private FindFirstAndLastPositionOfElementInSortedArray34 instance;

    @Test
    public void searchRangeTest() {
        int[] nums = new int[] { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] ans = instance.searchRange(nums, target);
        System.out.println(CommonUtil.printArrayInLine(ans));
    }
}
