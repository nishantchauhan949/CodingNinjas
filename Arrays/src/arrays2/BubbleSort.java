package arrays2;

import java.util.Scanner;

public class BubbleSort {

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

	//	public static void bubbleSort(int[] arr) {
	////		int swap = 0;
	////		for (int i = 1; i < arr.length ; i++) {
	////			if (arr[i] < arr[i - 1]) {
	////				swap++;
	////				int temp = arr[i - 1];
	////				arr[i - 1] = arr[i];
	////				arr[i] = temp;
	////			} else {
	////				continue;
	////			}
	////		}
	//		
	//		4 3 2 1 0
	//		
	//		int swap = -1;
	//		
	//		for (int i = 1; i < arr.length; i++) {
	//
	//			if (swap == -1) {
	//
	//				for (int j = 1; j < arr.length; j++) {
	//					if (arr[j] < arr[j - 1]) {
	//						int temp = arr[i - 1];
	//						arr[i - 1] = arr[i];
	//						arr[i] = temp;
	//					} else {
	//						continue;
	//					}
	//				}
	//
	//			} else if (swap == 0) {
	//				return;
	//			} else {
	//				for (int j = 1; j < swap; j++) {
	//					if (arr[j] < arr[j - 1]) {
	//						int temp = arr[i - 1];
	//						arr[i - 1] = arr[i];
	//						arr[i] = temp;
	//					} else {
	//						continue;
	//					}
	//				}
	//				swap++;
	//			}
	//		}
	//	}

	public static void bubbleSort(int[] arr) {
		int swap = -1;
		int limit = arr.length-1;

		for(int num = 0; num < arr.length; num++) {
			if(swap == 0) {
				break;
			}
			swap = 0;
			int i = 1;
			while( limit >= 0 && i <= limit) {
				if(arr[i-1] > arr[i]) {
					int temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					swap++;
				}
				i++;
			}
			limit--;
		}

	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		BubbleSort.bubbleSort(arr);
		print(arr);
	}

}
