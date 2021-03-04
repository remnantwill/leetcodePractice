package algorithms.hard;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = NumberOfValidWordsForEachPuzzle1178.class)
@RunWith(SpringRunner.class)
public class NumberOfValidWordsForEachPuzzle1178Test {

    @Autowired
    private NumberOfValidWordsForEachPuzzle1178 instance;

    @Test
    public void findNumOfValidWordsTest() {
        String[] words = new String[] { "aaaa", "asas", "able", "ability", "actt", "actor", "access" };
        String[] puzzles = new String[] { "aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz" };
        List<Integer> ans = instance.findNumOfValidWords(words, puzzles);
        System.out.println(CommonUtil.printListInLine(ans));
    }

    @Test
    public void findNumOfValidWordsTestII() {
        String[] words = new String[] { "aaaa", "asas", "able", "ability", "actt", "actor", "access" };
        String[] puzzles = new String[] { "aboveyz", "abrodyz", "abslute", "absoryz", "actresz", "gaswxyz" };
        List<Integer> ans = instance.findNumOfValidWordsII(words, puzzles);
        System.out.println(CommonUtil.printListInLine(ans));
    }
}
