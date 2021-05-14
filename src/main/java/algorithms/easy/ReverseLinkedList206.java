package algorithms.easy;

import Bean.ListNode;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList206 {

    /**
     * solution I: iteration
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    /**
     * solution II: recursive
     * @param head
     * @return
     */
    public ListNode reverseListII(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseListII(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
