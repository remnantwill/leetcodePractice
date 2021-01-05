package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = PositionsOfLargeGroups830.class)
@RunWith(SpringRunner.class)
public class PositionsOfLargeGroups830Test {

    @Autowired
    private PositionsOfLargeGroups830 instance;

    @Test
    public void largeGroupPositionsTest() {
//        String s = "abbxxxxzzy";
        String s = "abcdddeeeeaabbbcdddd";
        List<List<Integer>> ans = instance.largeGroupPositions(s);
        for (List<Integer> an : ans) {
            String s1 = CommonUtil.printListInLine(an);
            System.out.println(s1);
        }
    }
}
