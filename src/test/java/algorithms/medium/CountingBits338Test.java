package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CountingBits338.class)
@RunWith(SpringRunner.class)
public class CountingBits338Test {

    @Autowired
    private CountingBits338 instance;

    @Test
    public void countBitsIITest() {
        instance.countBitsII(5);
    }

    @Test
    public void countBitsIIITest() {
        instance.countBitsIII(5);
    }

    @Test
    public void countBitsIVTest() {
        instance.countBitsIV(5);
    }
}
