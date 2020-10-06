package LinkedList1;

import java.util.Scanner;

public class Runner {
    // take input, print and main function
    static Scanner s = new Scanner(System.in);

    public static LinkedListNode<Integer> takeInput() {
        int data = s.nextInt();

        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> current = null;

        while (data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<>(data);
            if (head == null) {
                head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        //int pos = s.nextInt();
        //int data = s.nextInt();
        //head = InsertNode.insert(head, data, pos);
        //head = DeleteNode.deleteIthNode(head, pos);
        //print(head);
        //System.out.println(LengthRecursively.length(head));
        //head = InsertNodeRecursively.insertR(head,data,pos);
        //print(head);
        //head = DeleteNodeRecursively.deleteIthNodeRec(head, pos);
        //LinkedListNode<Integer> head1 = takeInput();
        //LinkedListNode<Integer> head2 = takeInput();
        //LinkedListNode<Integer> bighead = MergeTwoSortedLL.mergeTwoList(head1,head2);
        //print(bighead);
        //System.out.println(MidPointLinkedList.printMiddel(head));
        //head = ReverseLL_Iteratively.reverse_I(head);
        //head = ReverseLL_Recursively.reverse_R(head);
        //print(head);
        //PrintReverseLL.printReverseRecursive(head);
        //System.out.println(PalindromeLinkedList.isPalindrome_2(head));
        int i = s.nextInt();
        int j = s.nextInt();
        head = SwapTwoNodeOfLL.swap_nodes(head, i, j);
        print(head);
    }
}
