package StacksUsingLL;

public class StacksLLUse {
    public static void main(String[] args) throws StackEmptyException {
        StacksUsingLinkedList<Integer> s = new StacksUsingLinkedList<>();
        s.push(3);
        s.printStack();

        s.pop();
        s.pop();
        s.printStack();
    }
}
