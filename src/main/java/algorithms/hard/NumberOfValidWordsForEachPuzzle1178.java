package algorithms.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/number-of-valid-words-for-each-puzzle/
 */
public class NumberOfValidWordsForEachPuzzle1178 {

    /**
     * solution I: Binary state compression
     * @param words
     * @param puzzles
     * @return
     */
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (String word : words) {
            int mask = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                mask |= (1 << (ch - 'a'));
            }
            if (Integer.bitCount(mask) <= 7) {
                frequency.put(mask, frequency.getOrDefault(mask, 0) + 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (String puzzle : puzzles) {
            int total = 0;
            int mask = 0;
            for (int i = 1; i < 7; i++) {
                mask |= (1 << (puzzle.charAt(i) - 'a'));
            }
            int subset = mask;
            do {
                int s = subset | (1 << (puzzle.charAt(0) - 'a'));
                if (frequency.containsKey(s)) {
                    total += frequency.get(s);
                }
                subset = (subset - 1) & mask;
            } while (subset != mask);
            ans.add(total);
        }
        return ans;
    }

    TrieNode root;

    /**
     * solution II: Dictionary tree
     * @param words
     * @param puzzles
     * @return
     */
    public List<Integer> findNumOfValidWordsII(String[] words, String[] puzzles) {
        root = new TrieNode();
        for (String word : words) {
            StringBuffer sb = new StringBuffer();
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            for (int i = 0; i < chars.length; i++) {
                if (i == 0 || chars[i] != chars[i - 1]) {
                    sb.append(chars[i]);
                }
            }
            add(sb.toString(), root);
        }
        List<Integer> ans = new ArrayList<>();
        for (String puzzle : puzzles) {
            char required = puzzle.charAt(0);
            char[] chars = puzzle.toCharArray();
            Arrays.sort(chars);
            ans.add(find(new String(chars), required, root, 0));
        }
        return ans;
    }

    private int find(String puzzle, char required, TrieNode cur, int pos) {
        if (cur == null) {
            return 0;
        }
        if (pos == 7) {
            return cur.frequency;
        }
        int ret = find(puzzle, required, cur.child[puzzle.charAt(pos) - 'a'], pos + 1);
        if (puzzle.charAt(pos) != required) {
            ret += find(puzzle, required, cur, pos + 1);
        }
        return ret;
    }

    private void add(String word, TrieNode root) {
        TrieNode cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.child[c - 'a'] == null) {
                cur.child[c - 'a'] = new TrieNode();
            }
            cur = cur.child[c - 'a'];
        }
        cur.frequency++;
    }

    private class TrieNode {
        int frequency;
        TrieNode[] child;

        public TrieNode() {
            frequency = 0;
            child = new TrieNode[26];
        }
    }

}
