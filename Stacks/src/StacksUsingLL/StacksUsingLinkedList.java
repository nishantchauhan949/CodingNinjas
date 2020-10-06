package StacksUsingLL;

public class StacksUsingLinkedList<T> {
    private LinkedListNode<T> head;
    private int count;

    public StacksUsingLinkedList() {
        this.head = null;
        this.count = 0;
    }

    public void push(T element) {
        LinkedListNode<T> newNode = new LinkedListNode<>(element);
        newNode.next = head;
        head = newNode;
        count++;
    }

    public T pop() throws StackEmptyException{
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        T data = head.data;
        head = head.next;
        count--;
        return data;
    }

    public T top() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        return head.data;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        if (size() == 0)
            return true;
        else
            return false;
    }

    public void printStack() {
        LinkedListNode<T> temp = this.head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
