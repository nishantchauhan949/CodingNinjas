package Trees;

import Queue.QueueEmptyException;
import Queue.QueueUsingLL;

import java.util.Scanner;

public class Runner {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
//        printTree(root);
//        System.out.println(CountNodes.countNodes(root));
        System.out.println(FindSumOfNodes.sumOfAllNode(root));
    }


    private static TreeNode<Integer> takeInput() {
        TreeNode<Integer> root = new TreeNode<>(s.nextInt());
        QueueUsingLL<TreeNode<Integer>> treeNodeQueue = new QueueUsingLL<>();
        treeNodeQueue.enqueue(root);

        while (!treeNodeQueue.isEmpty()) {
            TreeNode<Integer> curr;
            try {
                curr = treeNodeQueue.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }

            int i = s.nextInt();
            for (; i > 0; i--) {
                TreeNode<Integer> newNode = new TreeNode<>(s.nextInt());
                treeNodeQueue.enqueue(newNode);
                curr.children.add(newNode);
            }
        }

        return root;
    }

    private static void printTree(TreeNode<Integer> root){
        QueueUsingLL<TreeNode<Integer>> treeNodeQueue = new QueueUsingLL<>();

        treeNodeQueue.enqueue(root);

        while (!treeNodeQueue.isEmpty()){
            TreeNode<Integer> curr;
            try{
                curr = treeNodeQueue.dequeue();
            } catch (QueueEmptyException e){
                return;
            }

            System.out.print(curr.data + ":");

            for (int i = 0; i < curr.children.size(); i++){
                if (i == curr.children.size() - 1){
                    System.out.print(curr.children.get(i).data);
                }else {
                    System.out.print(curr.children.get(i).data + ",");
                }
                treeNodeQueue.enqueue(curr.children.get(i));
            }
            System.out.println();
        }
    }
}
