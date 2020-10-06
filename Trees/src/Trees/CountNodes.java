package Trees;

public class CountNodes {

    public static int countNodes(TreeNode<Integer> root){
        if (root.children.isEmpty()){
            return 1;
        }

        int count = 0;
        for (int i = 0; i < root.children.size(); i++){
            count = count + countNodes(root.children.get(i));
        }

        return count + 1;
    }

}
