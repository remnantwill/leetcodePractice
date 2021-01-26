package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = NumberOfEquivalentDominoPairs1128.class)
@RunWith(SpringRunner.class)
public class NumberOfEquivalentDominoPairs1128Test {

    @Autowired
    private NumberOfEquivalentDominoPairs1128 instance;

    @Test
    public void numEquivDominoPairsTest() {
//        int[][] dominoes = new int[][] {{1,2},{2,1},{3,4},{5,6}};
        int[][] dominoes = new int[][] {{1,2},{1,2},{1,1},{1,2},{2,2}};
        int ans = instance.numEquivDominoPairs(dominoes);
        System.out.println(ans);
    }
}
