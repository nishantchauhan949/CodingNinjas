package LinkedList2;

import LinkedList1.LinkedListNode;

public class FindAnElementRecursively {
    public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
       if (head == null){
           return -1;
       }

       if (head.data == n){
           return 0;
       }

        int smallIndex = indexOfNRec(head.next, n);
        if (smallIndex != -1)
            return smallIndex + 1;
        else if (head.data == n)
            return 0;
        else
            return smallIndex;

    }
}
