package LinkedList2;

import LinkedList1.LinkedListNode;

public class AppendLastNToFirst {
    public static LinkedListNode<Integer> append(LinkedListNode<Integer> head, int n) {
        LinkedListNode<Integer> tail = head, curr = head;
        int len = 0;
        while (curr != null){
            len++;
            tail = curr;
            curr = curr.next;
        }
        LinkedListNode<Integer> prev = null;
        curr = head;
        int point = len - n;
        for (int i = 0; i < point; i++){
            prev = curr;
            curr = curr.next;
        }
        tail.next = head;
        prev.next = null;
        return curr;
    }
}
