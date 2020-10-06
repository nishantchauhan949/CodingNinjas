package binarytrees;

import java.util.Scanner;

public class RunnerRec {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        printRec(takeInputRecursively());
    }
    public static void printRec(BinaryTreeNode<Integer> root){
        if (root == null)
            return;

        System.out.print(root.data + " : ");
        if (root.left != null){
            System.out.print("L " + root.left.data + ", ");
        } else {
            System.out.print("L -1, ");
        }

        if (root.right != null){
            System.out.println("R " + root.right.data);
        } else {
            System.out.println("R -1");
        }

        printRec(root.left);

        printRec(root.right);
    }

    public static BinaryTreeNode takeInputRecursively(){
        int input = s.nextInt();

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(input);
        root.left = takeInputRecHelper();
        root.right = takeInputRecHelper();

        return root;
    }

    public static BinaryTreeNode takeInputRecHelper(){
        int input = s.nextInt();

        if (input == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(input);
        root.left = takeInputRecHelper();
        root.right = takeInputRecHelper();

        return root;
    }

}
