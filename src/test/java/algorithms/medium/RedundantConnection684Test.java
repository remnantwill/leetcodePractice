package algorithms.medium;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RedundantConnection684.class)
@RunWith(SpringRunner.class)
public class RedundantConnection684Test {

    @Autowired
    private RedundantConnection684 instance;

    @Test
    public void findRedundantConnectionTest() {
        int[][] edges = new int[][] {{1,2}, {1,3}, {2,3}};
        int[] ans = instance.findRedundantConnection(edges);
        System.out.println(CommonUtil.printArrayInLine(ans));
    }

}
