package algorithms.hard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = WordBreakII140.class)
@RunWith(SpringRunner.class)
public class WordBreakII140Test {

    @Autowired
    WordBreakII140 instance;

    @Test
    public void wordBreakTest() {
        String s = "catsanddog";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("cat");
        wordDict.add("cats");
        wordDict.add("and");
        wordDict.add("sand");
        wordDict.add("dog");
        List<String> results = instance.wordBreak(s, wordDict);
        for (String result : results) {
            System.out.println(result);
        }
    }
}
