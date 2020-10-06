package binarytrees;

public class NumberOfNodesGreaterThanX {
    public static int numNodesGreaterX(BinaryTreeNode<Integer> root,int x){
        if (root == null)
            return 0;

        int count = 0;
        if (root.data > x)
            count++;

        int leftCount = numNodesGreaterX(root.left, x);
        int rightCount = numNodesGreaterX(root.right, x);

        return count + leftCount + rightCount;
    }

}
