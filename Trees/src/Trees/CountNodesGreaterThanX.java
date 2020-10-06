package Trees;

public class CountNodesGreaterThanX {
    public static int numNodeGreater(TreeNode<Integer> root, int x){
        if (root.children.isEmpty()){
            if (root.data > x){
                return 1;
            }
            return 0;
        }

        int count = 0;
        for (int i = 0; i < root.children.size(); i++){
            count = count + numNodeGreater(root.children.get(i), x);
        }

        if (root.data > x){
            return count + 1;
        } else {
            return count;
        }
    }
}
