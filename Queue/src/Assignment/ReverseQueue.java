package Assignment;

import QueueUsingLL.QueueEmptyException;
import QueueUsingLL.QueueUsingLL;

public class ReverseQueue {
    public static void reverseQueue(QueueUsingLL<Integer> q) {
        recursionReverse(q);
    }

    public static void recursionReverse(QueueUsingLL<Integer> q){
        if (q.isEmpty()){
            return;
        }

        int temp;
        try {
            temp = q.dequeue();
        } catch (QueueEmptyException e){
            return;
        }

        recursionReverse(q);
        q.enqueue(temp);

    }
}
