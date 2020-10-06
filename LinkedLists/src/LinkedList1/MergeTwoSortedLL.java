package LinkedList1;

public class MergeTwoSortedLL {
    // 0  1  2  3  4  5  6  7
    // 0->1->1->2->3->5->8->13->null
    // 1->2->2->2->4->5->null
    public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        LinkedListNode<Integer> bigHead = null;
        LinkedListNode<Integer> curr = null;
        LinkedListNode<Integer> newNode;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                newNode = new LinkedListNode<>(head1.data);

                head1 = head1.next;

            } else {
                newNode = new LinkedListNode<>(head2.data);
                head2 = head2.next;
            }
            if (bigHead == null) {
                bigHead = newNode;
                curr = newNode;
            } else {
                curr.next = newNode;
                curr = newNode;
            }
        }
        if (head1 != null) {
            while (head1 != null) {
                newNode = new LinkedListNode<>(head1.data);
                curr.next = newNode;
                curr = newNode;
                head1 = head1.next;
            }
        } else {
            while (head2 != null) {
                newNode = new LinkedListNode<>(head2.data);
                curr.next = newNode;
                curr = newNode;
                head2 = head2.next;
            }
        }
        return bigHead;
    }

}
