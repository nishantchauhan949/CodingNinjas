package recursion1;

import java.util.Scanner;

public class FirstIndexUsingHelper {
	static Scanner s = new Scanner(System.in);

	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static int helper(int input[], int startIndex, int x) {
		if(startIndex == input.length) {
			return -1;
		}
		if(input[startIndex] == x) {
			return startIndex;
		}
		int index = helper(input,startIndex+1,x);
		if(index == -1) {
			return -1;
		} else {
			return index; 
		}
	}

	public static int firstIndex(int input[], int x) {
		return helper(input, 0, x);
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(firstIndex(input, x));
	}
}
