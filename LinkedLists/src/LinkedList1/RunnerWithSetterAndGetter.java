package LinkedList1;

import java.util.Scanner;

public class RunnerWithSetterAndGetter {
    static Scanner s = new Scanner(System.in);
    public static LinkedListNodeWithSetterAndGetter<Integer> takeInput(){
        int data = s.nextInt();
        LinkedListNodeWithSetterAndGetter<Integer> head = null;
        LinkedListNodeWithSetterAndGetter<Integer> curr = null;
        while (data != -1){
            LinkedListNodeWithSetterAndGetter<Integer> newNode = new LinkedListNodeWithSetterAndGetter<>(data);
            if (head == null){
                head = newNode;
                curr = newNode;
            } else{
                curr.setNext(newNode);
                curr = newNode;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static void printLL(LinkedListNodeWithSetterAndGetter<Integer> head){
        while (head != null){
            System.out.print(head.getData() + "->");
            head = head.getNext();
        }
        System.out.println(head);
    }

    public static void main(String[] args) {
        LinkedListNodeWithSetterAndGetter<Integer> head = takeInput();
        head = EliminateDuplicatesFromLL.removeDuplicates(head);
        printLL(head);
    }
}
