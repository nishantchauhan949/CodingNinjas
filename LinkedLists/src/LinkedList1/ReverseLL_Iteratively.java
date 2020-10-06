package LinkedList1;

public class ReverseLL_Iteratively {
    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> tail = head;
        LinkedListNode<Integer> nextThanTail = tail.next;
        LinkedListNode<Integer> prev = null;

        while (tail != null) {
            tail.next = prev;
            prev = tail;
            head = tail;
            tail = nextThanTail;

            if (nextThanTail != null)
                nextThanTail = nextThanTail.next;

        }
        return head;
    }
}
