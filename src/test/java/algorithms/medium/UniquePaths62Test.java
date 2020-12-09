package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = UniquePaths62.class)
@RunWith(SpringRunner.class)
public class UniquePaths62Test {

    @Autowired
    private UniquePaths62 instance;

    @Test
    public void uniquePathsTest() {
        int m = 3, n = 2;
        int ans = instance.uniquePaths(m, n);
        System.out.println(ans);
    }

    @Test
    public void uniquePathsTestII() {
        int m = 3, n = 2;
        int ans = instance.uniquePathsII(m, n);
        System.out.println(ans);
    }

}
