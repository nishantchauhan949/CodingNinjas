package LinkedList2;

import LinkedList1.LinkedListNode;

import java.util.Scanner;

public class Runner {

    static Scanner s = new Scanner(System.in);

    public static LinkedListNode<Integer> takeInput() {
        LinkedListNode<Integer> head = null, tail = null;
        int data = s.nextInt();
        while(data != -1) {
            LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
            if(head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void print(LinkedListNode<Integer> head){
        while (head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> head = takeInput();
        int n = s.nextInt();
//        System.out.println(FindAnElementInLL.indexOfNIter(head, n));
//        print(MergeSort.mergeSort(head));
//        print(BubbleSort.bubbleSort(head));
//        print(AppendLastNToFirst.append(head, n));
//        print(EvenAfterOddLinkedList.sortEvenOdd(head));
//        print(RearrangeLinkedList.changelist(head));
        System.out.println(NthNodeFromLast.nthNodeFromLastIter(head, n));
    }
}
