package LinkedList1;

public class DeleteNode {
    public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i) {
        int len = LengthOfLL.length(head);

        if (i > len)
            return head;

        LinkedListNode<Integer> curr = head, prev = null, nextThanCurr = head.next;
        int count = 0;
        while (count != i) {
            prev = curr;
            curr = nextThanCurr;
            nextThanCurr = nextThanCurr.next;
            count++;
        }

        if (prev != null)
            prev.next = nextThanCurr;
        else
            head = nextThanCurr;

        return head;
    }
}
