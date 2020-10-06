package test2;

import java.util.Scanner;
import java.util.Arrays;

public class MaximumProfitOnApp {

	public static int maximumProfit(int arr[]) {
		Arrays.sort(arr);
		int avg = 0, count = 0, sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			count++;
		}
		avg = sum/count;
		int mid = arr.length/2;
		
		for(int i = mid; i < arr.length; i++) {
			int diff = 0;
			if(avg >= arr[i]) {
				diff = avg - arr[i];
			} else {
				diff = arr[i] - avg;
			}
		}
		return avg;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
			input[i] = s.nextInt();

		System.out.println(maximumProfit(input));
	}

}
