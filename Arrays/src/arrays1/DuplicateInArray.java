package arrays1;


import java.util.Arrays;
import java.util.Scanner;

public class DuplicateInArray {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	/* 9
		0 7 2 5 4 7 1 3 6     */
	
	public static int duplicate(int[] arr){  
		int duplicateNumber = 0;
		Arrays.sort(arr);
		for(int i = 1; i < arr.length; i++) {
			if((arr[i-1] ^ arr[i]) == 0) {
				duplicateNumber = duplicateNumber + arr[i];
			}
		}
		return duplicateNumber;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(DuplicateInArray.duplicate(arr));
	}

}
