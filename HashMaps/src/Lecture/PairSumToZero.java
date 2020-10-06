package Lecture;

import java.util.HashMap;

public class PairSumToZero {
    public static void PairSum(int[] input, int size) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : input){
            if (hm.containsKey(i)){
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }

        for (Integer key : hm.keySet()){
            if (key > 0){
                if (hm.containsKey((-1) * key)){
                    int factor = hm.get(key) * hm.get((-1) * key);
                    for (int i = 0; i < factor; i++){
                        System.out.println((-1) * key + " " + key);
                    }
                }
            }
        }
    }
}
