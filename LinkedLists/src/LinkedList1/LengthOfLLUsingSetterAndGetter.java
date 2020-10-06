package LinkedList1;

public class LengthOfLLUsingSetterAndGetter {
    public static int lengthOfLL(LinkedListNodeWithSetterAndGetter<Integer> head){
        int count = 0;
        while (head != null){
            count++;
            head = head.getNext();
        }
        return count;
    }
}
