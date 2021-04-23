package algorithms.hard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MaxSumRectangleNoLargerThanK363.class)
@RunWith(SpringRunner.class)
public class MaxSumRectangleNoLargerThanK363Test {

    @Autowired
    private MaxSumRectangleNoLargerThanK363 instance;

    @Test
    public void maxSumSubmatrixTest() {
        int[][] matrix = new int[][]{{1, 0, 1}, {0, -2, 3}};
        int k = 2;
        int ans = instance.maxSumSubmatrix(matrix, k);
        System.out.println(ans);
    }
}
