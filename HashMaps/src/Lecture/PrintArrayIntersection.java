package Lecture;

import java.util.HashMap;

public class PrintArrayIntersection {
    public static void intersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> hmForArr1 = new HashMap<>(), hmforArr2 = new HashMap<>();

        for (int i : arr1) {
            if (hmForArr1.containsKey(i)) {
                hmForArr1.put(i, hmForArr1.get(i) + 1);
            } else {
                hmForArr1.put(i, 1);
            }
        }

        for (int i : arr2) {
            if (hmforArr2.containsKey(i)) {
                hmforArr2.put(i, hmforArr2.get(i) + 1);
            } else {
                hmforArr2.put(i, 1);
            }
        }

        for (Integer keyArr1 : hmForArr1.keySet()) {
            if (hmforArr2.containsKey(keyArr1)) {
                if (hmForArr1.get(keyArr1) <= hmforArr2.get(keyArr1)) {
                    for (int i = 0; i < hmForArr1.get(keyArr1); i++) {
                        System.out.println(keyArr1);
                    }
                } else {
                    for (int i = 0; i < hmforArr2.get(keyArr1); i++) {
                        System.out.println(keyArr1);
                    }
                }
            }
        }
    }
}
