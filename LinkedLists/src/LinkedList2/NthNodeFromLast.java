package LinkedList2;

import LinkedList1.LinkedListNode;

public class NthNodeFromLast {
    public static LinkedListNode<Integer> nthNodeFromLastIter(LinkedListNode<Integer> head, int n) {
        int count = 0;
        LinkedListNode<Integer> curr = head;

        while(curr != null){
            count++;
            curr = curr.next;
        }
        curr = head;
        count = count - n;

        for(int i = 1; i < count; i++){
            curr = curr.next;
        }

        return curr;
    }
}
