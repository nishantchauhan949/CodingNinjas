package arrays1;

import java.util.Scanner;

public class LinearSearch {
/* Input format :
Line 1 : Integer n, Array Size
Line 2 : Array elements (separated by space)
Line 3 : Element to be searched (i.e. x)

Output :
Index of the number     */

	public static int linearSearch(int[] arr, int num){
		
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] == num) {
				return i;
			} 
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("How many integers in the array?");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		

		int [] arr = new int[n];
		int sum = 0;
		
		System.out.println("Enter all elements");
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
			//sum = sum + arr[i];
		}
		System.out.println("Enter the element you want to find");
		int num = s.nextInt();
		int index = linearSearch(arr, num);
		System.out.println(index);
		
	}

}
