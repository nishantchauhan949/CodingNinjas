package binarytrees;

import Queue.LinkedListNode;
import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

import java.util.ArrayList;

public class LevelWiseLinkedList {

    public static ArrayList<LinkedListNode<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
        ArrayList<LinkedListNode<BinaryTreeNode<Integer>>> output = new ArrayList<>();

        QueueUsingLL<BinaryTreeNode<Integer>> binaryTreeNodeQueueUsingLL = new QueueUsingLL<>();

        binaryTreeNodeQueueUsingLL.enqueue(root);

        while (!binaryTreeNodeQueueUsingLL.isEmpty()) {
            LinkedListNode<BinaryTreeNode<Integer>> head = null;
            LinkedListNode<BinaryTreeNode<Integer>> curr = head;
            while (!binaryTreeNodeQueueUsingLL.isEmpty()) {
                LinkedListNode<BinaryTreeNode<Integer>> newNode;
                try {
                    newNode = new LinkedListNode<>(binaryTreeNodeQueueUsingLL.dequeue());
                } catch (QueueEmptyException e) {
                    return null;
                }

                if (head == null) {
                    head = newNode;
                    curr = newNode;
                } else {
                    curr.next = newNode;
                    curr = newNode;
                }
            }
            output.add(head);
            while (head != null) {
                if (head.data.left != null) {
                    binaryTreeNodeQueueUsingLL.enqueue(head.data.left);
                }
                if (head.data.right != null) {
                    binaryTreeNodeQueueUsingLL.enqueue(head.data.right);
                }
                head = head.next;
            }
        }

        return output;
    }
}
