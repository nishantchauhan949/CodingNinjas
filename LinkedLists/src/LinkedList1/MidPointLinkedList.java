package LinkedList1;

public class MidPointLinkedList {
    public static int printMiddel(LinkedListNode<Integer> head) {
        int count = 0;
        LinkedListNode<Integer> curr = head;
        while (curr != null){
            count++;
            curr = curr.next;
        }
        int midpoint = 0;
        if(count % 2 == 0)
            midpoint = count/2;
        else
            midpoint = (count/2)+1;

        count = 1;
        while (count < midpoint){
            head = head.next;
            count++;
        }

        return head.data;
    }
}
