package recursion2;

import java.util.Scanner;

public class BinarySearch {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static int helper(int input[], int element, int startIndex, int endIndex) {
		if(endIndex < startIndex){
            return -1;
        }
		int mid  = (startIndex + endIndex)/2;
		
		if(input[mid] == element) {
			return mid;
		}
		
		if(input[mid] < element) {
			int index = helper(input, element, mid+1, endIndex);
			return index;
		} else {
			 int index = helper(input, element, startIndex, mid-1); 
			 return index;
		}

	}

	public static int binarySearch(int input[], int element) {
		return helper(input, element, 0, input.length-1);
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int element = s.nextInt();
		System.out.println(binarySearch(input, element));
	}

}
