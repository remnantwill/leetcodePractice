package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ReshapeTheMatrix566.class)
@RunWith(SpringRunner.class)
public class ReshapeTheMatrix566Test {

    @Autowired
    private ReshapeTheMatrix566 instance;

    @Test
    public void matrixReshapeTest() {
        int[][] nums = new int[][] { { 1, 2 }, { 3, 4 } };
        int r = 1;
        int c = 4;
        int[][] ans = instance.matrixReshape(nums, r, c);
        for (int[] an : ans) {
            System.out.println(CommonUtil.printArrayInLine(an));
        }
    }
}
