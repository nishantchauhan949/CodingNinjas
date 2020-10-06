package arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayIntersection {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i+" ");
		}
	}
	
	public static void intersection(int[] arr1, int[] arr2){
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int  i = 0, j = 0;

		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] > arr2[j]) {
				j++;
			} else if(arr1[i] < arr2[j]) {
				i++;
			} else {
				System.out.println(arr1[i]);
				i++;
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersection(arr1, arr2);
	}

}
