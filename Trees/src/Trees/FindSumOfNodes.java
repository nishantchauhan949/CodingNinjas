package Trees;

public class FindSumOfNodes {
    public static int sumOfAllNode(TreeNode<Integer> root){
        if (root.children.isEmpty()){
            return root.data;
        }

        int sum = 0;
        for (int i = 0; i < root.children.size(); i++){
            sum = sum + sumOfAllNode(root.children.get(i));
        }

        return sum + root.data;
    }
}
