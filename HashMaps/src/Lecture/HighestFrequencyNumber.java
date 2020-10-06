package Lecture;

import java.util.HashMap;

public class HighestFrequencyNumber {
    public static int maxFrequencyNumber(int[] arr) {
        if (arr.length == 0){
            return 0;
        }

        if (arr.length == 1){
            return arr[0];
        }

        HashMap<Integer, Integer> freqHashMap = new HashMap<>();

        Integer maxFreqValue = Integer.MIN_VALUE, maxFreqKey = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (!freqHashMap.containsKey(arr[i])) {
                //if not present in Hashmap
                freqHashMap.put(arr[i], 1);
            } else {
                //if Present
                freqHashMap.put(arr[i], freqHashMap.get(arr[i]) + 1);
            }
        }


        for (Integer key : freqHashMap.keySet()){
            if (maxFreqKey == Integer.MIN_VALUE){
                maxFreqKey = key;
            }
            if (freqHashMap.get(key) > maxFreqValue){
                maxFreqValue = freqHashMap.get(key);
                maxFreqKey = key;
            }
        }

        if (maxFreqValue == 1){
            return arr[0];
        }

        return maxFreqKey;
    }
}
