package LinkedList1;

public class InsertNodeRecursively {
    public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos) {
        int len = LengthOfLL.length(head);

        if (pos > len)
            return head;

        if (pos == 0) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            newNode.next = head;
            return newNode;
        }

        LinkedListNode<Integer> smallHead = insertR(head.next, data, pos - 1);
        head.next = smallHead;
        return head;
    }
}
