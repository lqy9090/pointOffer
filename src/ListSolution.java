public class ListSolution {
    public Node copyRandomList(Node head) {
        //在每个节点后面复制一个对应节点
        //移动随机指针
        //奇数节点

        return null;
    }

    public Node copyAfter(Node head) {
        Node pn = head;
        while (pn.next !=null){
            Node cpN = new Node(pn.val);
            cpN.next = pn.next;
            pn.next = cpN;
        }
        return null;
    }
}
