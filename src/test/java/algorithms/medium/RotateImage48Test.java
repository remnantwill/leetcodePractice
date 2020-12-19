package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RotateImage48.class)
@RunWith(SpringRunner.class)
public class RotateImage48Test {

    @Autowired
    private RotateImage48 instance;

    @Test
    public void rotateTest() {
        int[][] matrix =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        instance.rotate(matrix);
    }

    @Test
    public void rotateTestII() {
        int[][] matrix =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        instance.rotate(matrix);
    }
}
