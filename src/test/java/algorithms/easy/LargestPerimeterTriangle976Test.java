package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = LargestPerimeterTriangle976.class)
@RunWith(SpringRunner.class)
public class LargestPerimeterTriangle976Test {

    @Autowired
    private LargestPerimeterTriangle976 instance;

    @Test
    public void largestPerimeterTest() {
        int[] A = new int[] {2,1,2};
        int ans = instance.largestPerimeter(A);
        System.out.println(ans);
    }
}
