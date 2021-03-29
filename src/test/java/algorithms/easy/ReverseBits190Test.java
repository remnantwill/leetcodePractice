package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ReverseBits190.class)
@RunWith(SpringRunner.class)
public class ReverseBits190Test {

    @Autowired
    private ReverseBits190 instance;

    @Test
    public void reverseBitsTest() {
        int n = 43261596;
        instance.reverseBits(n);
    }

    @Test
    public void reverseBitsTestII() {
        int n = 43261596;
        instance.reverseBitsII(n);
    }
}
