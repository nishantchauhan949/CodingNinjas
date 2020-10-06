package Queue;

public class QueueUsingLL<T> {
    LinkedListNode<T> head;
    LinkedListNode<T> tail;
    int count;

    public QueueUsingLL() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public void enqueue(T element) {
        LinkedListNode<T> newNode = new LinkedListNode<T>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public T dequeue() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        T data = head.data;
        head = head.next;
        count--;
        return data;
    }

    public T front() throws QueueEmptyException {
        if (isEmpty()) {
            throw new QueueEmptyException();
        }
        return head.data;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void printQueue() {
        while (this.head != null) {
            System.out.println(this.head.data);
            this.head = this.head.next;
        }
    }

}
