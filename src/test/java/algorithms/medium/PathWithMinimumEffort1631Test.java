package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = PathWithMinimumEffort1631.class)
@RunWith(SpringRunner.class)
public class PathWithMinimumEffort1631Test {

    @Autowired
    private PathWithMinimumEffort1631 instance;

    @Test
    public void minimumEffortPathTest() {
        int[][] heights = new int[][] { { 1, 2, 2 }, { 3, 8, 2 }, { 5, 3, 5 } };
        int ans = instance.minimumEffortPath(heights);
        System.out.println(ans);
    }

    @Test
    public void minimumEffortPathTestII() {
        int[][] heights = new int[][] { { 1, 2, 2 }, { 3, 8, 2 }, { 5, 3, 5 } };
        int ans = instance.minimumEffortPathII(heights);
        System.out.println(ans);
    }

    @Test
    public void minimumEffortPathTestIII() {
        int[][] heights = new int[][] { { 1, 2, 2 }, { 3, 8, 2 }, { 5, 3, 5 } };
        int ans = instance.minimumEffortPathIII(heights);
        System.out.println(ans);
    }
}
