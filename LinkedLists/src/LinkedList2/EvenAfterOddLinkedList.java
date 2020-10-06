package LinkedList2;

import LinkedList1.LinkedListNode;

public class EvenAfterOddLinkedList {
    public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {

        if (head.next == null)
            return head;

        LinkedListNode<Integer> prev = null;
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> nextCurr = curr.next;
        LinkedListNode<Integer> headForEven = null, currForEven = headForEven;
        while (curr != null) {
            if (curr.data % 2 == 0) {
                LinkedListNode<Integer> newNode = new LinkedListNode<>(curr.data);
                if (headForEven == null) {
                    headForEven = newNode;
                    currForEven = newNode;
                } else {
                    currForEven.next = newNode;
                    currForEven = newNode;
                }
                if (curr == head) {
                    head = head.next;
                    curr = head;
                    nextCurr = curr.next;
                } else {
                    prev.next = nextCurr;
                    curr = nextCurr;
                    if (nextCurr != null) {
                        nextCurr = nextCurr.next;
                    }
                }
            } else {
                prev = curr;
                curr = nextCurr;
                if (nextCurr != null) {
                    nextCurr = nextCurr.next;
                }
            }
        }

        prev.next = headForEven;

        return head;
    }
}
