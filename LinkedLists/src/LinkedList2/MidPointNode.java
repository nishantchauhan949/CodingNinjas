package LinkedList2;

import LinkedList1.LinkedListNode;

public class MidPointNode {
    static LinkedListNode<Integer> midPointNode(LinkedListNode<Integer> head){
        LinkedListNode<Integer> curr = head;
        int count = 0;
        while (curr != null){
            count++;
            curr = curr.next;
        }

        int midPoint = 0;
        if (count % 2 == 0)
            midPoint = count/2;
        else
            midPoint = (count/2) + 1;

        count = 0;
        while (count < midPoint){
            head = head.next;
            count++;
        }

        return head;
    }
}
