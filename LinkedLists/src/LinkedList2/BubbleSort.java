package LinkedList2;

import LinkedList1.LengthOfLL;
import LinkedList1.LinkedListNode;
import LinkedList1.SwapTwoNodeOfLL;

public class BubbleSort {
    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        int len = LengthOfLL.length(head);
        int checker = -1;
        while (checker != 0) {

            LinkedListNode<Integer> curr = head, nextCurr = curr.next;
            checker = 0;

            for (int i = 0, j = 1; j < len; ) {
                if (curr.data > nextCurr.data) {
                    head = SwapTwoNodeOfLL.swap_nodes(head, i, j);
                    curr = head;
                    nextCurr = curr.next;
                    for (int count = 0; count < j; count++) {
                        curr = nextCurr;
                        nextCurr = nextCurr.next;
                    }
                    i++;
                    j++;
                    checker++;
                } else {
                    curr = nextCurr;
                    nextCurr = nextCurr.next;
                    i++;
                    j++;
                }
            }
        }
        return head;
    }
}
