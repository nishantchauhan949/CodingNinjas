package arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class PairSumInArray {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	/* 9								  0 1 2 3 4 5 6 7 8 (order)
		1 3 6 2 5 4 3 2 4     -> 1 2 2 3 3 4 4 5 6
		7										*/
	public static void pairSum(int[] arr, int num){
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = arr.length - 1; j >i; j--) {
				if(i == j) {
					continue;
				}
				if(arr[i] + arr[j] == num) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s.nextInt();
		PairSumInArray.pairSum(arr, num);
	}

}
