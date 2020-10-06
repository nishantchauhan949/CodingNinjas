package Lecture;

import Queue.BinaryTreeNode;

import java.util.ArrayList;
import java.util.HashMap;

public class VerticalOrder {

    private static void printVerticalHelper(BinaryTreeNode<Integer> root, int order, HashMap<Integer, ArrayList<Integer>> orderHM){
        if (root == null){
            return;
        }

        if (orderHM.containsKey(order)){
            orderHM.get(order).add(root.data);
        } else {
            ArrayList<Integer> orderArr = new ArrayList<>();
            orderArr.add(root.data);
            orderHM.put(order, orderArr);
        }

        printVerticalHelper(root.left, order - 1, orderHM);
        printVerticalHelper(root.right, order + 1, orderHM);
    }
    public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root){
        HashMap<Integer, ArrayList<Integer>> orderHashMap = new HashMap<>();
        printVerticalHelper(root, 0, orderHashMap);

        for (Integer key : orderHashMap.keySet()){
            for (int i = 0; i < orderHashMap.get(key).size(); i++){
                System.out.print(orderHashMap.get(key).get(i));
            }
            System.out.println();
        }
    }
}
