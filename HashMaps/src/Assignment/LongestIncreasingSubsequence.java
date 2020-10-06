package Assignment;

import java.util.ArrayList;
import java.util.HashMap;

class Pair{
    int arrIndex;
    boolean flag;
}

public class LongestIncreasingSubsequence {
    public static ArrayList<Integer> longestSubsequence(int[] arr) {
        HashMap<Integer, Pair> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Pair ans = new Pair();
            ans.arrIndex = i;
            ans.flag = true;
            hm.put(arr[i], ans);
        }

        int maxLength = Integer.MIN_VALUE, start = Integer.MIN_VALUE;
        for (Integer key : hm.keySet()) {
            Pair newPair = hm.get(key);
            if (newPair.flag) {
                newPair.flag = false;
                hm.put(key, newPair);

                int i = 1, length = 1, insideStart = key;
                while (hm.containsKey(key + i)) {
                    length++;
                    Pair anotherPair = hm.get(key + i);
                    anotherPair.flag = false;
                    hm.put(key + i, anotherPair);
                    i++;
                }

                i = 1;
                while (hm.containsKey(key - i)){
                    insideStart = key - i;
                    length++;
                    Pair anotherPair = hm.get(key - i);
                    anotherPair.flag = false;
                    hm.put(key - i, anotherPair);
                    i++;
                }

                if (maxLength == Integer.MIN_VALUE && start == Integer.MIN_VALUE){
                    maxLength = length;
                    start = insideStart;
                } else if (length == maxLength){
                    Pair p1 = hm.get(start), p2 = hm.get(insideStart);
                    if (p2.arrIndex < p1.arrIndex){
                        start = insideStart;
                    }
                } else if (length > maxLength){
                    maxLength = length;
                    start = insideStart;
                }
            }
        }

        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0, k = start; i < maxLength; i++){
            output.add(k + i);
        }

        return output;
    }
}