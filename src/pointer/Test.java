package pointer;

public class Test {

    public void deleteNodeTest() {
        ListNode head = new ListNode(4);ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);ListNode node4 = new ListNode(9);
        head.next = node2; node2.next = node3; node3.next = node4; node4.next = null;

        Solution solution = new Solution();
        ListNode listNode = solution.deleteNode(head, 5);
//        ListNode pNode = new ListNode(listNode.val);
        while (listNode.next != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    public static void main(String[] args) {
        Test test = new Test();
        test.deleteNodeTest();
    }
}
