package binarytrees;

public class ConstructTreeFromPreorderAndInorder {
    public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in) {
        int i = 0;
        for (; i < in.length; i++) {
            if (in[i] == pre[0]) {
                break;
            }
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(pre[0]);
        root.left = helperGetTree(pre, 1, pre.length - 1, in, 0, i - 1);
        root.right = helperGetTree(pre, 1, pre.length - 1, in, i + 1, in.length - 1);

        return root;
    }

    private static BinaryTreeNode<Integer> helperGetTree(int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }

        int i = inStart;
        for (; i <= inEnd; i++) {
            if (in[i] == pre[preStart]) {
                break;
            }
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(pre[preStart]);
        BinaryTreeNode<Integer> leftRoot = helperGetTree(pre, preStart + 1, preEnd, in, inStart, i - 1);
        BinaryTreeNode<Integer> rightRoot = helperGetTree(pre, preStart + 1, preEnd, in, i + 1, inEnd);

        root.left = leftRoot;
        root.right = rightRoot;

        return root;
    }
}
