package binarytrees;

public class FindANodeInBinaryTree {

    public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
        if (root == null)
            return false;

        boolean isPresentOnLeftSide = isNodePresent(root.left, x);
        boolean isPresentOnRightSide = isNodePresent(root.right, x);

        if (isPresentOnLeftSide || isPresentOnRightSide){
            return true;
        } else {
            if (root.data == x){
                return true;
            }
        }

        return false;
    }

}
