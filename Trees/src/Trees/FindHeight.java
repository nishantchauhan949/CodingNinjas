package Trees;

public class FindHeight {
    public static int height(TreeNode<Integer> root) {
        if (root.children.isEmpty()) {
            return 1;
        }

        int maxHeightFromSubtrees = -1;
        for (int i = 0; i < root.children.size(); i++) {
            int getHeight = height(root.children.get(i));

            if (maxHeightFromSubtrees == -1) {
                maxHeightFromSubtrees = getHeight;
            } else {
                if (getHeight > maxHeightFromSubtrees) {
                    maxHeightFromSubtrees = getHeight;
                }
            }
        }

        return maxHeightFromSubtrees + 1;
    }
}
