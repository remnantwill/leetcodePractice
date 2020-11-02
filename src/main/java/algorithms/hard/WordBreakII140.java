package algorithms.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/word-break-ii/
 */
public class WordBreakII140 {

    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<Integer, List<List<String>>> map = new HashMap<>();
        List<List<String>> breakList = backTrack(s, s.length(), new HashSet<>(wordDict), 0, map);
        List<String> wordsList = new ArrayList<>();
        for (List<String> strings : breakList) {
            wordsList.add(String.join(" ", strings));
        }
        return wordsList;
    }

    private List<List<String>> backTrack(String s, int length, HashSet<String> wordSet, int index, Map<Integer, List<List<String>>> map) {
        if (!map.containsKey(index)) {
            List<List<String>> breakWords = new LinkedList<>();
            if (index == length) {
                breakWords.add(new LinkedList<>());
            }
            for (int i = index + 1; i <= length; i++) {
                String word = s.substring(index, i);
                if (wordSet.contains(word)) {
                    List<List<String>> nextWordBreaks = backTrack(s, length, wordSet, i, map);
                    for (List<String> nextWordBreak : nextWordBreaks) {
                        LinkedList<String> wordBreak = new LinkedList<>(nextWordBreak);
                        wordBreak.offerFirst(word);
                        breakWords.add(wordBreak);
                    }
                }
            }
            map.put(index, breakWords);
        }
        return map.get(index);
    }

}
