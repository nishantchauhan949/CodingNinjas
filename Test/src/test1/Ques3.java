package test1;

import java.util.Scanner;

public class Ques3 {

	public static void printSecondLargest(int input[], int n) { 
		int i, first, second; 

		first = second = Integer.MIN_VALUE; 
		for (i = 0; i < n ; i++) { 
			if (input[i] > first) { 
				second = first; 
				first = input[i]; 
			} 
			else if (input[i] > second && input[i] != first) {
				second = input[i]; 
			}
		} 

		if (second == Integer.MIN_VALUE) {
			System.out.print(Integer.MIN_VALUE); 
		}
		else {
			System.out.print(second); 
		}
	} 

	public static void main(String[] args) {
		//System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int [] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
			//System.out.print(input[i] + " ");
		}
		printSecondLargest(arr, n);

	}

}
