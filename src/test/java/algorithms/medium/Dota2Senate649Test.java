package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Dota2Senate649.class)
@RunWith(SpringRunner.class)
public class Dota2Senate649Test {

    @Autowired
    private Dota2Senate649 instance;

    @Test
    public void predictPartyVictoryTest() {
        String senate = "RD";
//        String senate = "RDD";
        String ans = instance.predictPartyVictory(senate);
        System.out.println(ans);
    }
}
