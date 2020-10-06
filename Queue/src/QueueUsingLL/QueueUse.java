package QueueUsingLL;

public class QueueUse {
    public static void main(String[] args) {
        QueueUsingLL<Integer> q = new QueueUsingLL<Integer>();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.printQueue();
    }
}
