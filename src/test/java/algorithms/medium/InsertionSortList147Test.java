package algorithms.medium;

import Bean.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = InsertionSortList147.class)
@RunWith(SpringRunner.class)
public class InsertionSortList147Test {

    @Autowired
    private InsertionSortList147 instance;

    @Test
    public void insertionSortListTest() {
        ListNode head = construtInputVal();
        ListNode ans = instance.insertionSortList(head);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }

    }

    private ListNode construtInputVal() {
        ListNode head = new ListNode(-1);
        ListNode node1 = new ListNode(5);
        head.next = node1;
        ListNode node2 = new ListNode(3);
        node1.next = node2;
        ListNode node3 = new ListNode(4);
        node2.next = node3;
        ListNode node4 = new ListNode(0);
        node3.next = node4;
        return head;
    }
}
