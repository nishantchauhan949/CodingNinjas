package binarytrees;

public class Mirror {
    public static void mirror(BinaryTreeNode<Integer> root){
        if (root == null)
            return;

        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);
    }
}
