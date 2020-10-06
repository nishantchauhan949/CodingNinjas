package Trees;

public class NodesAtDepthK {
    public static void printNodesAtDepthK(TreeNode<Integer> root, int k) {
        if (k == 0) {
            System.out.print(root.data + " ");
            return;
        }

        for (int i = 0; i < root.children.size(); i++) {
            printNodesAtDepthK(root.children.get(i), k - 1);
        }
    }
}
