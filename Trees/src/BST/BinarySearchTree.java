package BST;

import binarytrees.BinaryTreeNode;

public class BinarySearchTree {
    private BinaryTreeNode<Integer> root;

    //    public BinarySearchTree(){
//
//    }
    public boolean search(int element) {
        return searchInBST(root, element);
    }

    public boolean searchInBST(BinaryTreeNode<Integer> root, int element) {
        if (root == null) {
            return false;
        }
        if (root.data == element) {
            return true;
        }

        if (element < root.data) {
            return searchInBST(root.left, element);
        } else {
            return searchInBST(root.right, element);
        }
    }

    public void insert(int element) {
        root = insertNode(root, element);
    }

    private BinaryTreeNode<Integer> insertNode(BinaryTreeNode<Integer> root, int element) {
        if (root == null) {
            BinaryTreeNode<Integer> ans = new BinaryTreeNode<>(element);
            return ans;
        }

        if (element < root.data) {
            root.left = insertNode(root.left, element);
        } else {
            root.right = insertNode(root.right, element);
        }

        return root;
    }

    public void delete(int element){
        root = deleteNode(root, element);
    }

    public BinaryTreeNode<Integer> deleteNode(BinaryTreeNode<Integer> root, int element){
        if (root == null){
            return null;
        }
        if (root.data == element){
            if (root.left == null && root.right == null){
                return null;
            }else if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            } else {
                BinaryTreeNode<Integer> temp = root.right;
                while (temp.left != null){
                    temp = temp.left;
                }
                root.data = temp.data;
                root.right = deleteNode(root.right, temp.data);
                return root;
            }
        } else if (element < root.data){
            root = deleteNode(root.left, element);
        } else {
            root = deleteNode(root.right, element);
        }
        return root;
    }

    public void printTree(){
        printTreeHelper(root);
    }
    private void printTreeHelper(BinaryTreeNode<Integer> root){
        if (root == null){
            return;
        }

        System.out.println(root.data + ":L:" + root.left + ",R:" + root.right);
    }
}
