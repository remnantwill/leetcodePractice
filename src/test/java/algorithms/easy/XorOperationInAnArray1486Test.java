package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = XorOperationInAnArray1486.class)
@RunWith(SpringRunner.class)
public class XorOperationInAnArray1486Test {

    @Autowired
    private XorOperationInAnArray1486 instance;

    @Test
    public void xorOperationIITest() {
        int n = 5;
        int start = 0;
        int ans = instance.xorOperationII(n, start);
        System.out.println(ans);
    }
}
