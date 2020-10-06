package arrays1;

import java.util.Scanner;

public class SwapAlternate {

	public static void swapAlternate(int[] input){

		if(input.length % 2 == 0) {
			for(int i = 0; i < input.length; i += 2) {
				int src = i;
				int dest = i+1;

				int temp = input[src];
				input[src] = input[dest];
				input[dest] = temp;

				System.out.print(input[i] + " " + input[i+1] + " ");
			}
		} else {
			for(int i = 1; i < input.length; i += 2) {
				int src = i;
				int dest = i-1;

				int temp = input[src];
				input[src] = input[dest];
				input[dest] = temp;
				
				System.out.print(input[i-1] + " " + input[i] + " ");
			}
			System.out.println(input[input.length - 1]);
		}
	}

	public static void main(String[] args) {
		//System.out.println("How many integers in the array?");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int [] arr = new int[n];

		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		swapAlternate(arr);
	}

}
