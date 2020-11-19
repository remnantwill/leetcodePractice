package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MatrixCellsInDistanceOrder1030.class)
@RunWith(SpringRunner.class)
public class MatrixCellsInDistanceOrder1030Test {

    @Autowired
    private MatrixCellsInDistanceOrder1030 instance;

    @Test
    public void allCellsDistOrderTest() {
        int R = 2, C = 2, r0 = 0, c0 = 1;
        int[][] res = instance.allCellsDistOrder(R, C, r0, c0);
        for (int[] re : res) {
            System.out.println(CommonUtil.printArrayInLine(re));
        }
    }

    @Test
    public void allCellsDistOrderIITest() {
        int R = 2, C = 2, r0 = 0, c0 = 1;
        int[][] res = instance.allCellsDistOrderII(R, C, r0, c0);
        for (int[] re : res) {
            System.out.println(CommonUtil.printArrayInLine(re));
        }
    }

    @Test
    public void allCellsDistOrderIIITest() {
        int R = 2, C = 2, r0 = 0, c0 = 1;
        int[][] res = instance.allCellsDistOrderIII(R, C, r0, c0);
        for (int[] re : res) {
            System.out.println(CommonUtil.printArrayInLine(re));
        }
    }
}
