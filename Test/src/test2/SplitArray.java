package test2;

import java.util.Scanner;

public class SplitArray {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i = 0; i < n; i++) {
			input[i] = s.nextInt();
		}
		System.out.println(splitArray(input));
	}
	
	static boolean splitArray(int arr[]) { 
		int n = arr.length;
		return splitArrayHelper(arr, n, 0, 0, 0); 
	}

	public static boolean splitArrayHelper(int arr[], int n, int start, int LHSsum, int RHSsum) { 
		if (start == n) 
			return LHSsum == RHSsum; 

		if (arr[start] % 5 == 0) 
			LHSsum += arr[start]; 

		else if (arr[start] % 3 == 0) 
			RHSsum += arr[start]; 

		else
			return splitArrayHelper(arr, n, start + 1, LHSsum + arr[start], RHSsum) || splitArrayHelper(arr, n, start + 1, LHSsum, RHSsum + arr[start]); 

		return splitArrayHelper(arr, n, start + 1, LHSsum, RHSsum); 
	} 

}
