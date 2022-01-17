package pointer;

import java.util.List;

public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode currentNode = new ListNode(head.val);
        ListNode pNode = new ListNode(head.val);
        pNode.next = head.next;
        while (pNode.next != null) {
            if (pNode.val == val) {
                currentNode.next = pNode.next;
            }
            currentNode = pNode;
            pNode = pNode.next;
        }

        return head;
    }
}
