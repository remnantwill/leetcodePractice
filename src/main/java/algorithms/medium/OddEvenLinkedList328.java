package algorithms.medium;

import Bean.ListNode;

/**
 * https://leetcode-cn.com/problems/odd-even-linked-list/
 */
public class OddEvenLinkedList328 {

    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode evenHead = head.next;
        ListNode odd = head, even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

}
