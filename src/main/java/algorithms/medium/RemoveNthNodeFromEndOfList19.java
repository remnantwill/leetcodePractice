package algorithms.medium;

import Bean.ListNode;

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 */
public class RemoveNthNodeFromEndOfList19 {

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

}
