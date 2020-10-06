package Lecture;

import java.util.TreeMap;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int arr[]) {

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i : arr) {
            if (treeMap.containsKey(i)) {
                treeMap.put(i, treeMap.get(i) + 1);
            } else {
                treeMap.put(i, 1);
            }
        }

        int[] output = new int[treeMap.size()];
        int i = 0;
        for (Integer key : treeMap.keySet()) {
            output[i] = key;
            i++;
        }
        return output;
    }
}
