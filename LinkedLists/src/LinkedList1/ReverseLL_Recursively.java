package LinkedList1;

public class ReverseLL_Recursively {
    public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
        //LinkedListNode<Integer> curr = head;

        if (head.next == null)
            return head;

        LinkedListNode<Integer> smallHead = reverse_R(head.next);
        head.next = null;
        LinkedListNode<Integer> smallCurr = smallHead;
        while (smallCurr.next != null){
            smallCurr = smallCurr.next;
        }
        smallCurr.next = head;
        return smallHead;
    }
}
