package Trees;

import java.util.ArrayList;

public class TreeNode<T> {
    T data;
    ArrayList<TreeNode> children;

    TreeNode(T element){
        this.data = element;
        children = new ArrayList<>();
    }
}
