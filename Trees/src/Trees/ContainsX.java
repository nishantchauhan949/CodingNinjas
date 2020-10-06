package Trees;

public class ContainsX {
    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
        if (root.data == x){
            return true;
        }

        for (int i = 0; i < root.children.size(); i++){
            boolean flag = checkIfContainsX(root.children.get(i), x);

            if (flag){
                return true;
            }
        }

        return false;
    }
}
