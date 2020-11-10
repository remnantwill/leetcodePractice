package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = KClosestPointsToOrigin973.class)
@RunWith(SpringRunner.class)
public class KClosestPointsToOrigin973Test {

    @Autowired
    private KClosestPointsToOrigin973 instance;

    @Test
    public void kClosestTest() {
        int[][] points = new int[][]{{1,3}, {-2,2}};
        int K = 1;
        int[][] res = instance.kClosestIII(points, K);
        for (int[] re : res) {
            for (int i : re) {
                System.out.println(i);
            }
        }
    }
}
