package algorithms.hard;

import algorithms.hard.RedundantConnectionII685;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@SpringBootTest(classes = RedundantConnectionII685.class)
@RunWith(SpringRunner.class)
class RedundantConnectionII685Test {

    @Autowired
    private RedundantConnectionII685 redundantConnectionII685;

    @Test
    void testRepeatedSubstringPattern() {
        int[][] input = {{1,2},{1,3},{2,3}};
        int[] result = redundantConnectionII685.findRedundantDirectedConnection(input);
        System.out.println(Arrays.toString(result));
    }
}
