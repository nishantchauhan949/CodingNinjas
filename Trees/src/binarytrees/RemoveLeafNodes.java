package binarytrees;

public class RemoveLeafNodes {
    public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
        if (root == null){
            return null;
        }

        if (root.left == null && root.right == null){
            return null;
        }

        BinaryTreeNode<Integer> leftRoot = removeAllLeaves(root.left);
        BinaryTreeNode<Integer> rightRoot = removeAllLeaves(root.right);

        root.left = leftRoot;
        root.right = rightRoot;

        return root;
    }
}
