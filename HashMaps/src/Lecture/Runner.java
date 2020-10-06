package Lecture;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size1 = s.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < size1; i++){
            arr1[i] = s.nextInt();
        }

//        int size2 = s.nextInt();
//        int[] arr2 = new int[size2];
//        for (int i = 0; i < size2; i++){
//            arr2[i] = s.nextInt();
//        }
//        int[] output = RemoveDuplicates.removeDuplicates(arr1);
//        for (int i : output){
//            System.out.print(i + " ");
//        }
        PairSumToZero.PairSum(arr1, size1);
//        PrintArrayIntersection.intersection(arr1, arr2);
//        System.out.println(HighestFrequencyNumber.maxFrequencyNumber(arr));
    }
}
