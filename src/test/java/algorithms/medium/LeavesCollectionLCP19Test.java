package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = LeavesCollectionLCP19.class)
@RunWith(SpringRunner.class)
public class LeavesCollectionLCP19Test {

    @Autowired
    private LeavesCollectionLCP19 instance;

    @Test
    public void minimumOperationsTest() {
        String leaves = "rrryyyrryyyrr";
        int res = instance.minimumOperations(leaves);
        System.out.println(res);
    }

}
