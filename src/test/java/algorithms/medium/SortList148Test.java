package algorithms.medium;

import Bean.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SortList148.class)
@RunWith(SpringRunner.class)
class SortList148Test {

    @Autowired
    private SortList148 instance;

    @Test
    void sortListTest() {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
        ListNode ans = instance.sortList(head);
        ListNode node = ans;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
