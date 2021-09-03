package algorithms.easy;

import Bean.ListNode;

/**
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */
public class JianzhiOffer22 {

    /**
     * solution I: traverse in order
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        int n = 0;
        ListNode node = null;
        for (node = head; node != null; node = node.next) {
            n++;
        }
        for (node = head; n > k; n--) {
            node = node.next;
        }
        return node;
    }

    /**
     * solution II: fast and slow pointer
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEndII(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && k > 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

}
