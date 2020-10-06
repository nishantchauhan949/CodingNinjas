package BST;

import binarytrees.BinaryTreeNode;

public class SearchInBST {
    public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root , int k){
        if (root == null){
            return null;
        }

        if (root.data == k){
            return root;
        }

        if (k < root.data){
            return searchInBST(root.left, k);
        } else {
            return searchInBST(root.right, k);
        }
    }
}
