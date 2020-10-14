package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = FindCommonCharacters1002.class)
@RunWith(SpringRunner.class)
public class FindCommonCharacters1002Test {

    @Autowired
    private FindCommonCharacters1002 findCommonCharacters1002;

    @Test
    public void testCommonChars() {
        String[] input = {"bella","label","roller"};
        List<String> res = findCommonCharacters1002.commonChars(input);
        for (String re : res) {
            System.out.println(re);
        }
    }

}
