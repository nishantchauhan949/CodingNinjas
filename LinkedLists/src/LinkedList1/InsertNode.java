package LinkedList1;

public class InsertNode {

    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int data, int pos) {
        int len = LengthOfLL.length(head);

        if (pos > len) {
            return head;
        }

        LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
        newNode.next = null;
        int count = 0;
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;

        while (count != pos) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        if (prev == null) {
            head = newNode;
        } else {
            prev.next = newNode;
        }
        newNode.next = curr;

        return head;
    }

}
