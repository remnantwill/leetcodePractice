package algorithms.medium;

import Bean.ListNode;

/**
 * https://leetcode-cn.com/problems/reverse-linked-list-ii/
 */
public class ReverseLinkedListII92 {

    /**
     * solution I: thread the needle
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode rightNode = pre;
        for (int i = 0; i < right - left + 1; i++) {
            rightNode = rightNode.next;
        }
        ListNode leftNode = pre.next;
        ListNode cur = rightNode.next;
        pre.next = null;
        rightNode.next = null;
        reverseListNode(leftNode);
        pre.next = rightNode;
        leftNode.next = cur;
        return dummyNode.next;
    }

    private void reverseListNode(ListNode head) {
        ListNode pre = head;
        ListNode cur = pre.next;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
    }

    /**
     * solutionII: One time traversal, "thread the needle", reverse the linked list (head insertion method)
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetweenII(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }
        ListNode cur = pre.next;
        ListNode next;
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummyNode.next;
    }

}
