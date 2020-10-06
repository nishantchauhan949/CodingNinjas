package arrays1;

import java.util.Scanner;

public class ArraySum {

	public static int sum (int[] input){
		int sum = 0;
		for(int i = 0; i < input.length; i++) {
			//arr[i] = s.nextInt();
			sum = sum + input[i];
		}
		return sum;
	}

	public static void printerSum() {
		System.out.println("How many integers in the array?");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int [] arr = new int[n];
		int sum = 0;

		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
			//sum = sum + arr[i];
		}
		sum = sum(arr);
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		printerSum();
	}

}
