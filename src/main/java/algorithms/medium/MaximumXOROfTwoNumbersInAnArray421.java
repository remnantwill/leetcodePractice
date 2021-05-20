package algorithms.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/maximum-xor-of-two-numbers-in-an-array/
 */
public class MaximumXOROfTwoNumbersInAnArray421 {

    /**
     * solution I: hash set
     *
     * @param nums
     * @return
     */
    public int findMaximumXOR(int[] nums) {
        int x = 0;
        int highBit = 30;
        for (int k = highBit; k >= 0; k--) {
            Set<Integer> seen = new HashSet<>();
            for (int num : nums) {
                seen.add(num >> k);
            }
            int xNext = x * 2 + 1;
            boolean found = false;
            for (int num : nums) {
                if (seen.contains(xNext ^ (num >> k))) {
                    found = true;
                    break;
                }
            }
            if (found) {
                x = xNext;
            } else {
                x = xNext - 1;
            }
        }
        return x;
    }

    private final int HIGH_BIT = 30;
    Trie root = new Trie();

    /**
     * solution II: dictionary tree
     *
     * @param nums
     * @return
     */
    public int findMaximumXORII(int[] nums) {
        int n = nums.length;
        int x = 0;
        for (int i = 1; i < n; i++) {
            add(nums[i - 1]);
            x = Math.max(x, check(nums[i]));
        }
        return x;
    }

    private int check(int num) {
        Trie cur = this.root;
        int x = 0;
        for (int k = HIGH_BIT; k >= 0; k--) {
            int bit = (num >> k) & 1;
            if (bit == 0) {
                if (cur.right != null) {
                    cur = cur.right;
                    x = x * 2 + 1;
                } else {
                    cur = cur.left;
                    x = x * 2;
                }
            } else {
                if (cur.left != null) {
                    cur = cur.left;
                    x = x * 2 + 1;
                } else {
                    cur = cur.right;
                    x = x * 2;
                }
            }
        }
        return x;
    }

    private void add(int num) {
        Trie cur = this.root;
        for (int k = HIGH_BIT; k >= 0; k--) {
            int bit = (num >> k) & 1;
            if (bit == 0) {
                if (cur.left == null) {
                    cur.left = new Trie();
                }
                cur = cur.left;
            } else {
                if (cur.right == null) {
                    cur.right = new Trie();
                }
                cur = cur.right;
            }
        }
    }

    private class Trie {
        private Trie left;
        private Trie right;
    }

}

