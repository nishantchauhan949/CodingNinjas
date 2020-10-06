package LinkedList2;

import LinkedList1.LinkedListNode;
import LinkedList1.MergeTwoSortedLL;


public class MergeSort {
    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        if (head.next == null)
            return head;

        LinkedListNode<Integer> mid = MidPointNode.midPointNode(head);

        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> prev = null;
        while (curr != mid){
            prev = curr;
            curr = curr.next;
        }
        prev.next = null;

        LinkedListNode<Integer> head1 = mergeSort(head);
        LinkedListNode<Integer> head2 = mergeSort(mid);
        return  MergeTwoSortedLL.mergeTwoList(head1, head2);
    }
}
