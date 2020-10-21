package algorithms.medium;

import Bean.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEndOfList19 {

    /**
     * calculate list length solution
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0, head);
        int length = nodeLength(head);
        ListNode cur = dummyNode;
        for (int i = 1; i < length - n + 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        ListNode ans = dummyNode.next;
        return ans;
    }

    private int nodeLength(ListNode head) {
        int length = 0;
        ListNode node = head;
        while (node != null) {
            ++length;
            node = node.next;
        }
        return length;
    }

    /**
     * stack solution
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEndII(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        Deque<ListNode> stack = new LinkedList<>();
        ListNode cur = dummy;
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        prev.next = prev.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    /**
     * one time traversal solution
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEndIII(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
