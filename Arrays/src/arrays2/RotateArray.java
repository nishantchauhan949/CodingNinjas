package arrays2;

import java.util.Scanner;

public class RotateArray {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void rotate(int[] arr, int d) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == d) {
				
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		int index = s.nextInt();
		rotate(arr, index);
		print(arr);
	}
}
