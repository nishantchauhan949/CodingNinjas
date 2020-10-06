package arrays2;

import java.util.Scanner;

public class SelectionSort {

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

	public static void selectionSort(int[] arr){
		for(int i = 0; i < arr.length; i++) {
			int smallest = arr[i], indexForJ = -1;
			boolean flag = false;
			for(int j = i+1; j <arr.length; j++) {
				if(arr[j] < smallest) {
					indexForJ = j;
					smallest = arr[j];
					flag = true;
				}
			}
			if(flag) {
				int temp = arr[i];
				arr[i] = smallest;
				arr[indexForJ] = temp; 
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		SelectionSort.selectionSort(arr);
		print(arr);
	}

}
