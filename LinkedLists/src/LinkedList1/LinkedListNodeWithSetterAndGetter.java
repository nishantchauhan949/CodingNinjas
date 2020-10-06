package LinkedList1;

public class LinkedListNodeWithSetterAndGetter<T> {
    private T data;
    private LinkedListNodeWithSetterAndGetter<T> next;

    public LinkedListNodeWithSetterAndGetter(T value){
        setData(value);
        this.next = null;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(LinkedListNodeWithSetterAndGetter<T> newNode) {
        this.next = newNode;
    }

    public LinkedListNodeWithSetterAndGetter<T> getNext() {
        return next;
    }
}
