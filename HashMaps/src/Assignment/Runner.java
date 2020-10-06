package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sze=s.nextInt();
        int[] arr = new int[sze];
        for(int index = 0;index<sze;index++){
            arr[index]=s.nextInt();
        }
        ArrayList<Integer> ans = LongestIncreasingSubsequence.longestSubsequence(arr);
        for(int i : ans) {
            System.out.println(i);
        }
    }
}
