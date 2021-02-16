package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = FindAllNumbersDisappearedInAnArray448.class)
@RunWith(SpringRunner.class)
public class FindAllNumbersDisappearedInAnArray448Test {

    @Autowired
    private FindAllNumbersDisappearedInAnArray448 instance;

    @Test
    public void findDisappearedNumbersTest() {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> ans = instance.findDisappearedNumbers(nums);
        System.out.println(CommonUtil.printListInLine(ans));
    }
}
