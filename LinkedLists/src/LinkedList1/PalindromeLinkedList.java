package LinkedList1;

public class PalindromeLinkedList {

    public static boolean isPalindrome_2(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> curr = head;
        LinkedListNode<Integer> head2 = null;
        LinkedListNode<Integer> duplicateCurr = null;
        while (curr != null){
            LinkedListNode<Integer> newNode = new LinkedListNode<>(curr.data);
            if (head2 == null){
                head2 = newNode;
                duplicateCurr = newNode;
            } else {
                duplicateCurr.next = newNode;
                duplicateCurr = newNode;
            }
            curr = curr.next;
        }

        head2 = ReverseLL_Recursively.reverse_R(head2);
        boolean flag = false;
        while (head != null && head2 != null){
            if (head.data.equals(head2.data))
                flag = true;
            else
                return false;

            head = head.next;
            head2 = head2.next;
        }

        return flag;
    }
}
