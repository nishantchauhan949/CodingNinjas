package LinkedList1;

class EliminateDuplicatesFromLL {
    static LinkedListNodeWithSetterAndGetter<Integer> removeDuplicates(LinkedListNodeWithSetterAndGetter<Integer> head) {
        int len = LengthOfLLUsingSetterAndGetter.lengthOfLL(head);
        if (len == 0 || len == 1){
            return head;
        }
        LinkedListNodeWithSetterAndGetter<Integer> curr = head.getNext();
        LinkedListNodeWithSetterAndGetter<Integer> newNumberPosition = head;

        while (curr != null) {
            if (newNumberPosition.getData().equals(curr.getData())) {
                newNumberPosition.setNext(null);
                curr = curr.getNext();
            } else {
                newNumberPosition.setNext(curr);
                newNumberPosition = newNumberPosition.getNext();
                curr = curr.getNext();
            }
        }
        return head;
    }
}
