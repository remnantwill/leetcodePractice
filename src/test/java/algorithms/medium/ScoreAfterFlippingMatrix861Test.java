package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ScoreAfterFlippingMatrix861.class)
@RunWith(SpringRunner.class)
public class ScoreAfterFlippingMatrix861Test {

    @Autowired
    private ScoreAfterFlippingMatrix861 instance;

    @Test
    public void matrixScoreTest() {
        int[][] A = new int[][] {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int ans = instance.matrixScore(A);
        System.out.println(ans);
    }

}
