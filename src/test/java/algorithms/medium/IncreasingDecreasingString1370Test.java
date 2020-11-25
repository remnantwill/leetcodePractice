package algorithms.medium;

import algorithms.easy.IncreasingDecreasingString1370;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = IncreasingDecreasingString1370.class)
@RunWith(SpringRunner.class)
public class IncreasingDecreasingString1370Test {

    @Autowired
    private IncreasingDecreasingString1370 instance;

    @Test
    public void sortStringTest() {
        String s = "aaaabbbbcccc";
        String ans = instance.sortString(s);
        System.out.println(ans);
    }

}
