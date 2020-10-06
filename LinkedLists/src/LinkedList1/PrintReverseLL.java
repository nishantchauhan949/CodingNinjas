package LinkedList1;

public class PrintReverseLL {
    public static void printReverseRecursive(LinkedListNode<Integer> head) {
        if (head.next == null) {
            System.out.print(head.data + " ");
            return;
        }

        printReverseRecursive(head.next);
        System.out.print(head.data + " ");
    }
}
