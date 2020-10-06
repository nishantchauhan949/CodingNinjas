package LinkedList2;

import LinkedList1.LinkedListNode;

public class FindAnElementInLL{
    public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
        int index = 0;
        while (head != null){
            if (head.data == n){
                return index;
            }
            index++;
            head = head.next;
        }
        return -1;
    }
}
