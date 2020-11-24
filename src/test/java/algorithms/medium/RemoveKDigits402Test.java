package algorithms.medium;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RemoveKDigits402.class)
@RunWith(SpringRunner.class)
class RemoveKDigits402Test {

    @Autowired
    private RemoveKDigits402 instance;

    @Test
    void removeKdigitsTest() {
        String ans = instance.removeKdigits("1432219", 3);
        System.out.println(ans);
    }
}
