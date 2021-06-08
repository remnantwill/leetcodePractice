package algorithms.easy;

import Bean.ListNode;

/**
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 */
public class RemoveLinkedListElements203 {

    /**
     * solution I: recursive
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    /**
     * solution II: iteration
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElementsII(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tmp = dummy;
        while (tmp.next != null) {
            if (tmp.next.val == val) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
        return dummy.next;
    }

}
