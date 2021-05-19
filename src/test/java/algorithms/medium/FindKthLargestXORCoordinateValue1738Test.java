package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = FindKthLargestXORCoordinateValue1738.class)
@RunWith(SpringRunner.class)
public class FindKthLargestXORCoordinateValue1738Test {

    @Autowired
    private FindKthLargestXORCoordinateValue1738 instance;

    @Test
    public void kthLargestValueIITest() {
        int[][] matrix = new int[][] { { 5, 2 }, { 1, 6 } };
        int k = 2;
        int ans = instance.kthLargestValueII(matrix, k);
        System.out.println(ans);
    }
}
