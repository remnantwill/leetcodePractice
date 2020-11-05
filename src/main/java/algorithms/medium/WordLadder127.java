package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/word-ladder/
 */
public class WordLadder127 {

    Map<String, Integer> wordIdMap = new HashMap<>();
    List<List<Integer>> edges = new ArrayList<>();
    int nodeNum = 0;

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        for (String word : wordList) {
            addEdge(word);
        }
        addEdge(beginWord);
        if (!wordIdMap.containsKey(endWord)) {
            return 0;
        }
        int[] dis = new int[nodeNum];
        Arrays.fill(dis, Integer.MAX_VALUE);
        Integer beginId = wordIdMap.get(beginWord);
        Integer endId = wordIdMap.get(endWord);
        dis[beginId] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(beginId);
        while (!queue.isEmpty()) {
            Integer x = queue.poll();
            if (x == endId) {
                return dis[endId] / 2 + 1;
            }
            for (Integer it : edges.get(x)) {
                if (dis[it] == Integer.MAX_VALUE) {
                    dis[it] = dis[x] + 1;
                    queue.offer(it);
                }
            }
        }
        return 0;
    }

    private void addEdge(String word) {
        addWord(word);
        Integer id1 = wordIdMap.get(word);
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char tmp = chars[i];
            chars[i] = '*';
            String newWord = new String(chars);
            addWord(newWord);
            Integer id2 = wordIdMap.get(newWord);
            edges.get(id1).add(id2);
            edges.get(id2).add(id1);
            chars[i] = tmp;
        }
    }

    private void addWord(String word) {
        if (!wordIdMap.containsKey(word)) {
            wordIdMap.put(word, nodeNum++);
            edges.add(new ArrayList<>());
        }
    }

}
