package binarytrees;

public class NumberOfLeafNodes {
    public static int noOfLeafNodes(BinaryTreeNode<Integer> root){
        if (root == null)
            return 0;

        int leftCount = noOfLeafNodes(root.left);
        int rightCount = noOfLeafNodes(root.right);

        int count = leftCount + rightCount;
        if(leftCount == 0 & rightCount == 0){
            count++;
        }

        return count;
    }
}
