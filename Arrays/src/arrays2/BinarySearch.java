package arrays2;

import java.util.Scanner;

public class BinarySearch {

	static Scanner s1 = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s1.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s1.nextInt();
		}
		return arr;
	}

	public static int binarySearch(int [] input, int s) {
		int indexNumber = input.length/2;
		for(int i = 0; i < input.length; i++) {
			if(input[indexNumber] == s) {
				return indexNumber;
			} else if(input[indexNumber] > s) {
				indexNumber = indexNumber/2;
			} else {
				indexNumber = (indexNumber + input.length)/2;
				i = indexNumber;
				
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s1.nextInt();
		System.out.print(BinarySearch.binarySearch(arr, num));
	}

}
