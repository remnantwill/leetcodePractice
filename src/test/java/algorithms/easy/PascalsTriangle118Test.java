package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = PascalsTriangle118.class)
@RunWith(SpringRunner.class)
public class PascalsTriangle118Test {

    @Autowired
    private PascalsTriangle118 instance;

    @Test
    public void generateTest() {
        List<List<Integer>> ans = instance.generate(5);
        for (List<Integer> list : ans) {
            System.out.println(CommonUtil.printListInLine(list));
        }
    }
}
