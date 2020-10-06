package recursion2;

import java.util.Scanner;

public class PrintSubsetsOfArray {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		printSubsets(input);
	}

	public static void printSubsets(int input[]) {
		int output[][] = subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[][] subSetDemo(int[] arr, int index) {
		if (arr.length == index) {
			int[][] ans = new int[1][0];
			return ans;
		}
		int[][] smallAns = subSetDemo(arr, index + 1);
		int[][] ans = new int[smallAns.length * 2][];

		for (int i = 0; i < smallAns.length; i++) {
			ans[i] = new int[smallAns[i].length];
			ans[i] = smallAns[i];
		}
		for (int i = 0; i < smallAns.length; i++) {
			ans[i + smallAns.length] = new int[smallAns[i].length + 1];
			ans[i + smallAns.length][0] = arr[index];
			for (int j = 1; j < ans[i + smallAns.length].length; j++) {
				ans[i + smallAns.length][j] = smallAns[i][j - 1];
			}
		}
		return ans;
	}

	public static int[][] subsets(int input[]) {
		int index = 0;
		return subSetDemo(input, index);
	}

}
