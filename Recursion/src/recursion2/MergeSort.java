package recursion2;

import java.util.Scanner;

public class MergeSort {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void printArray(int input[]) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

	public static void merge(int arr1[], int arr2[], int [] input){
		int i = 0, j = 0;
		while( i < arr1.length) {
			while( j < arr2.length) {
				if(arr1[i] <= arr2[j]) {
					input[i+j] = arr1[i];
					i++;
					if(i >= arr1.length) {
						for(int k = i+j; k < input.length; k++) {
							input[k] = arr2[j];
							j++;
						}
					}
				} else if(arr2[j] < arr1[i]){
					input[i+j] = arr2[j];
					j++;
					if(j >= arr2.length) {
						for(int k = i+j; k < input.length; k++) {
							input[k] = arr1[i];
							i++;
						}
					}
				}
			}
		}
	}

	public static void mergeSort(int[] input){
		if(input.length <= 1) {
			return;
		}
		int mid = input.length/2;

		int b[] = new int[mid];
		int c[] = new int[input.length-b.length];


		for(int i = 0; i < mid; i++) {
			b[i] = input[i];
		}
		int k = 0;
		for(int j = mid; j < input.length; j++) {
			c[k] = input[j];
			k++;
		}

		mergeSort(b);
		mergeSort(c);
		merge(b, c, input);
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		mergeSort(input);
		printArray(input);
	}
}
