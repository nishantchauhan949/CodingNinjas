package arrays2;

import java.util.Scanner;

public class MergeTwoSortedArrays {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){

		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	//	 arr1 = 5			arr2 = 7
	//  0 1 2 3 4		 0 1  2  3   4  5   6
	// [0,1,2,8,9]		[0,1,10,15,17,19,20]
	// [0, 0, 1, 1, 2, 8, 9, 10, 15, 17, 19, 20]
	public static int[] merge(int arr1[], int arr2[]){
		int [] outputArr = new int[arr1.length + arr2.length];
		int i = 0, j = 0;
		while( i < arr1.length) {
			while( j < arr2.length) {
				if(arr1[i] <= arr2[j]) {
					outputArr[i+j] = arr1[i];
					i++;
					if(i >= arr1.length) {
						for(int k = i+j; k < outputArr.length; k++) {
							outputArr[k] = arr2[j];
							j++;
						}
					}
				} else if(arr2[j] < arr1[i]){
					outputArr[i+j] = arr2[j];
					j++;
					if(j >= arr2.length) {
						for(int k = i+j; k < outputArr.length; k++) {
							outputArr[k] = arr1[i];
							i++;
						}
					}
				}
			}
		}
		return outputArr;
	}


	public static void main(String[] args) {

		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		int ans[] = merge(arr1, arr2);
		for(int i = 0; i < ans.length; i++){
			System.out.print(ans[i] + " ");
		}
	}

}
