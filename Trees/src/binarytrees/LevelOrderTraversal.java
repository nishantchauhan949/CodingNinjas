package binarytrees;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

import java.util.ArrayList;

public class LevelOrderTraversal {
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        if (root == null) {
            //precaution
            return;
        }

        //Queue that will provide node for ArrayList
        QueueUsingLL<BinaryTreeNode<Integer>> queueForArr = new QueueUsingLL<>();

        System.out.println(root.data);
        queueForArr.enqueue(root);

        while (!queueForArr.isEmpty()) {
            //ArrayList will get nodes from Queue's node's left and right
            ArrayList<BinaryTreeNode<Integer>> goingToBePrintedArr = new ArrayList<>();
            while (!queueForArr.isEmpty()) {
                //the node dequeued from Queue will be "forPrinting".
                BinaryTreeNode<Integer> forPrinting;
                try {
                    forPrinting = queueForArr.dequeue();
                } catch (QueueEmptyException e) {
                    return;
                }
                if (forPrinting.left != null) {
                    //the dequeued node's left is added to the arraylist
                    goingToBePrintedArr.add(forPrinting.left);
                }
                if (forPrinting.right != null) {
                    //the dequeued node's right is added to the arraylist
                    goingToBePrintedArr.add(forPrinting.right);
                }
            }
            for (BinaryTreeNode<Integer> i : goingToBePrintedArr) {
                //node is added to the queue and then it's data is printed
                queueForArr.enqueue(i);
                System.out.print(i.data + " ");
            }
            System.out.println();
        }
    }
}
