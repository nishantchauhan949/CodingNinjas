package Trees;

public class NodeWithMaximumChildSum {
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        if (root.children.isEmpty()){
            return root;
        }

        TreeNode<Integer> maxNode = null;
        for (int i = 0; i < root.children.size(); i++){
            if (maxNode == null){
                maxNode = maxSumNode(root.children.get(i));
            } else {
                TreeNode<Integer> someNode = maxSumNode(root.children.get(i));
            }


        }

        return maxNode;
    }

}
