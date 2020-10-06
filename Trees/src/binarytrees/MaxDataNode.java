package binarytrees;

public class MaxDataNode {
    public static BinaryTreeNode<Integer> maxDataNode(BinaryTreeNode<Integer> root){
        if (root == null)
            return null;

        BinaryTreeNode<Integer> maxNode = root;

        BinaryTreeNode<Integer> leftNode = maxDataNode(root.left);

        if (leftNode != null){
            if (maxNode.data < leftNode.data){
                maxNode = leftNode;
            }
        }
        BinaryTreeNode<Integer> rightNode = maxDataNode(root.right);
        if (rightNode != null){
            if (maxNode.data < rightNode.data){
                maxNode = rightNode;
            }
        }

        return maxNode;
    }
}
