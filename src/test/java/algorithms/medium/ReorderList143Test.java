package algorithms.medium;

import Bean.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ReorderList143.class)
@RunWith(SpringRunner.class)
public class ReorderList143Test {

    @Autowired
    ReorderList143 reorderList143;

    @Test
    public void testReorderList() {
        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        head.next = next;
        ListNode nextNext = new ListNode(3);
        next.next = nextNext;
        nextNext.next = new ListNode(4);
        reorderList143.reorderList(head);
        ListNode node = head;
        StringBuffer stringBuffer = new StringBuffer();
        while (node != null) {
            stringBuffer.append(node.val).append(" ");
            node = node.next;
        }
        System.out.println(stringBuffer.toString());
    };
}
