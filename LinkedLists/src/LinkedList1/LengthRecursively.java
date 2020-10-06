package LinkedList1;

public class LengthRecursively {
    public static int length(LinkedListNode<Integer> head) {
        if (head.next == null)
            return 1;

        int smallCount = length(head.next);
        int count = smallCount + 1;
        return count;
    }
}
