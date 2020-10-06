package Trees;

public class MaxDataNode {

    public static TreeNode<Integer> maxDataNode(TreeNode<Integer> root) {
        if (root.children.isEmpty()) {
            return root;
        }

        TreeNode<Integer> maxNode = root;

        for (int i = 0; i < root.children.size(); i++){
            TreeNode<Integer> node = maxDataNode(root.children.get(i));
            if (node.data > maxNode.data){
                maxNode = node;
            }
        }

        return maxNode;
    }

}
