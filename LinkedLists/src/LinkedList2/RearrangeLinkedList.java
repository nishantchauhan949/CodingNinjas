package LinkedList2;

import LinkedList1.LinkedListNode;

public class RearrangeLinkedList {
    public static LinkedListNode<Integer> changeListHelper(LinkedListNode<Integer> head, LinkedListNode<Integer> curr, LinkedListNode<Integer> mid){
        if (mid.next == null){
            head.next = mid;
            return head;
        }

        LinkedListNode<Integer> smallHead = changeListHelper(head, curr.next, mid.next);
        LinkedListNode<Integer> tailForSmallHead = smallHead;
        while (tailForSmallHead.next != null){
            tailForSmallHead = tailForSmallHead.next;
        }
        tailForSmallHead.next = curr;
        curr.next = mid;
        return smallHead;
    }


    public static LinkedListNode<Integer> changelist(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> mid = MidPointNode.midPointNode(head);
        LinkedListNode<Integer> curr = head;
        return changeListHelper(head,curr, mid);
    }
}
