package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = PascalsTriangleII119.class)
@RunWith(SpringRunner.class)
public class PascalsTriangleII119Test {

    @Autowired
    private PascalsTriangleII119 instance;

    @Test
    public void getRowTestOptII() {
        List<Integer> ans = instance.getRowOptII(3);
        System.out.println(CommonUtil.printListInLine(ans));
    }

    @Test
    public void getRowTestII() {
        List<Integer> ans = instance.getRowII(3);
        System.out.println(CommonUtil.printListInLine(ans));
    }
}
