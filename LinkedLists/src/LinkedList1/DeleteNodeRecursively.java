package LinkedList1;

public class DeleteNodeRecursively {

    public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i){
       int len = LengthOfLL.length(head);
       if (i > len)
           return head;

       if (i == 0){
           head = head.next;
           return head;
       }
       LinkedListNode<Integer> smallHead = deleteIthNodeRec(head.next, i-1);
       head.next = smallHead;
       return head;
    }

}
