package binarytrees;

public class SumOfAllNodes {
    public static int sum(BinaryTreeNode<Integer> root){
        if (root == null){
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        return leftSum + rightSum + root.data;
    }
}
