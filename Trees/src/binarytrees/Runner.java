package binarytrees;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

import java.util.Scanner;

public class Runner {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = takeInput();
//        LevelOrderTraversal.printLevelWise(root);
//        System.out.println(FindDiameter.diameterOfBinaryTree(root);
//        System.out.println(isBalanced.checkBalanced(root));
//        LevelOrderTraversal.printLevelWise(root);
//        ArrayList<LinkedListNode<BinaryTreeNode<Integer>>> output = LevelWiseLinkedList.LLForEachLevel(root);
//        for(LinkedListNode<BinaryTreeNode<Integer>> head : output){
//            LinkedListNode<BinaryTreeNode<Integer>> temp = head;
//            while(temp != null){
//                System.out.print(temp.data.data + " ") ;
//                temp = temp.next;
//            }
//            System.out.println();
//        }

//        ZigZagTree.printZigZag(root);
        int [] pre = {1,2,3,4,15,5,6,7,8,10,9,12};
        int [] in = {4,15,3,2,5,1,6,10,8,7,9,12};
//        ConstructTreeFromPreorderAndInorder.getTreeFromPreorderAndInorder(pre, in);
        printLevelWise(ConstructTreeFromPreorderAndInorder.getTreeFromPreorderAndInorder(pre, in));
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root){
        if (root == null){
            return;
        }
        QueueUsingLL<BinaryTreeNode<Integer>> nodesToBePrinted = new QueueUsingLL<>();

        nodesToBePrinted.enqueue(root);

        while (!nodesToBePrinted.isEmpty()){
            BinaryTreeNode<Integer> curr;
            try{
                curr = nodesToBePrinted.dequeue();
            } catch(QueueEmptyException e){
                return;
            }

            System.out.print(curr.data + ":L");
            if (curr.left == null){
                System.out.print("-1,R:");
            }else {
                System.out.print(curr.left.data + ",R:");
                nodesToBePrinted.enqueue(curr.left);
            }

            if (curr.right == null){
                System.out.println("-1");
            }else {
                System.out.println(curr.right.data);
                nodesToBePrinted.enqueue(curr.right);
            }
        }
    }

    public static BinaryTreeNode<Integer> takeInput(){
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<BinaryTreeNode<Integer>>();

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(s.nextInt());
        pendingNodes.enqueue(root);

        while (!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> curr;

            try {
                curr = pendingNodes.dequeue();
            }catch (QueueEmptyException e){
                return null;
            }

            int leftChildData = s.nextInt();
            if (leftChildData != -1){
                BinaryTreeNode<Integer> leftChild = new BinaryTreeNode<>(leftChildData);
                curr.left = leftChild;
                pendingNodes.enqueue(leftChild);
            }

            int rightChildData = s.nextInt();
            if (rightChildData != -1){
                BinaryTreeNode<Integer> rightChild = new BinaryTreeNode<>(rightChildData);
                curr.right = rightChild;
                pendingNodes.enqueue(rightChild);
            }
        }

        return root;
    }
}
