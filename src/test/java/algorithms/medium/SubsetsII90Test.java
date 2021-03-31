package algorithms.medium;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = SubsetsII90.class)
@RunWith(SpringRunner.class)
public class SubsetsII90Test {

    @Autowired
    private SubsetsII90 instance;

    @Test
    public void subsetsWithDupTest() {
        int[] nums = new int[] { 1, 2, 2 };
        List<List<Integer>> ans = instance.subsetsWithDup(nums);
        for (List<Integer> an : ans) {
            String s = CommonUtil.printListInLine(an);
            System.out.println(s);
        }
    }

    @Test
    public void subsetsWithDupTestII() {
        int[] nums = new int[] { 1, 2, 2 };
        List<List<Integer>> ans = instance.subsetsWithDupII(nums);
        for (List<Integer> an : ans) {
            String s = CommonUtil.printListInLine(an);
            System.out.println(s);
        }
    }

}
