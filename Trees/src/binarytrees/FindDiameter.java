package binarytrees;

class HeightAndDiameter{
    // a pair class to return height and diameter by a function
    int height;
    int diameter;
}

public class FindDiameter {

    private static HeightAndDiameter diameter(BinaryTreeNode<Integer> root){
        //an object is created in the beginning that will be returned as its name is ans, short for answer.
        HeightAndDiameter ans = new HeightAndDiameter();

        if (root == null){
            //base case, if root is equal to null then ans is returned and not null;
            //because if null is returned nullpointerexception will come when accessing the null's height or diameter
            return ans;
        }

        //left subtree's object is created and diameter and height is calculated
        HeightAndDiameter leftObj;
        leftObj = diameter(root.left);

        //right subtree's object is created and diameter and height is calculated
        HeightAndDiameter rightObj;
        rightObj = diameter(root.right);

        //option1 is if the diameter is passing through root
        int option1 = (leftObj.height + rightObj.height) + 1;
        //option 2 is diameter of left subtree
        int option2 = leftObj.diameter;
        //option 3 is diameter of right subtree
        int option3 = rightObj.diameter;

        //height is calculated here
        ans.height = 1 + Math.max(leftObj.height, rightObj.height);

        //diameter is calculated here
        ans.diameter = Math.max(option1, Math.max(option2, option3));
        return ans;
    }

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        //creating an object of HeightAndDiameter class, which will store diameter and height returned by diameter method
        HeightAndDiameter diameterObj = diameter(root);
        //returning diameter of the object diameter
        return diameterObj.diameter;
    }

}
