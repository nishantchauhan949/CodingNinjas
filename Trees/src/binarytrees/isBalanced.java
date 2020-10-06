package binarytrees;

class HeightAndBalanced {
    int height;
    boolean isBalanced;

    HeightAndBalanced() {
        height = 0;
        isBalanced = true;
    }
}

public class isBalanced {

    private static HeightAndBalanced checkBalancedHelper(BinaryTreeNode<Integer> root) {
        HeightAndBalanced ans = new HeightAndBalanced();

        if (root == null) {
            return ans;
        }

        HeightAndBalanced leftSubTree, rightSubTree;

        leftSubTree = checkBalancedHelper(root.left);
        rightSubTree = checkBalancedHelper(root.right);

        if (leftSubTree.isBalanced && rightSubTree.isBalanced) {
            int balanceFactor = Math.abs(leftSubTree.height - rightSubTree.height);
            if (balanceFactor <= 1) {
                ans.height = 1 + Math.max(leftSubTree.height, rightSubTree.height);
                ans.isBalanced = true;
            } else {
                ans.height = 1 + Math.max(leftSubTree.height, rightSubTree.height);
                ans.isBalanced = false;
            }
        } else {
            ans.height = 1 + Math.max(leftSubTree.height, rightSubTree.height);
            ans.isBalanced = false;
        }

        return ans;
    }

    public static boolean checkBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return true;
        }

        HeightAndBalanced output = checkBalancedHelper(root);
        return output.isBalanced;
    }

}
