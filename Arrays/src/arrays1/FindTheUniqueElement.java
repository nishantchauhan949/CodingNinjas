package arrays1;

import java.util.Scanner;

public class FindTheUniqueElement {

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	/* 7
		7 8 8 7 4 4 6    */
	public static int findUnique(int[] arr) {
		int theXor = 0;
		for(int i = 0; i < arr.length; i++) {
			theXor = theXor ^ arr[i];
		}
		return theXor;
	}
		
	public static void main(String[] args) {
		System.out.println("Enter n");
		int[] arr = takeInput();
		//System.out.println(7^8^8^7^4^4^6);
		System.out.print(findUnique(arr));
	}

}
