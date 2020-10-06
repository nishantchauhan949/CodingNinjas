package recursion1;

import java.util.Scanner;

public class AllIndicesofNumber {

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static int[] allIndexes(int a[], int x) {
		if (a.length == 0) {
			int[] output = new int[0];
			return output;
		}

		int b[] = new int[a.length - 1];
		for (int i = 1; i < a.length; i++) {
			b[i - 1] = a[i];
		}

		int[] smallOutput = allIndexes(b, x);

		if (a[0] == x) {
			int[] output = new int[smallOutput.length + 1];
			output[0] = 0;
			for (int i = 0; i < smallOutput.length; i++) {
				output[i + 1] = smallOutput[i] + 1;
			}
			return output;
		} else {
			for (int i = 0; i < smallOutput.length;i++) {
				smallOutput[i]++;
			}
			return smallOutput;
		}
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		int output[] = allIndexes(input, x);

		for(int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}
}


