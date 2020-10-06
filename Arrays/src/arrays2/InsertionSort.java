package arrays2;

import java.util.Scanner;

public class InsertionSort {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
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

	public static void insertionSort(int[] arr){
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		InsertionSort.insertionSort(arr);
		print(arr);
	}
}
