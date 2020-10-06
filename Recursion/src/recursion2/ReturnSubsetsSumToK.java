package recursion2;

import java.util.Scanner;

public class ReturnSubsetsSumToK {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int k = s.nextInt();
		int output[][] = subsetsSumK(input, k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static int[][] subsetsSumK(int[] arr,int k){
		return subsetSumToKHelper(arr,k,0);
	}

	public static int[][] subsetSumToKHelper(int[] arr,int k,int sI){
		if(sI == arr.length) {
			if(k==0) {
				int[][] output = new int[1][0];
				return output;
			}else {
				int[][] output = new int[0][0];
				return output;
			}
		}
		int[][] smallOutput1 = subsetSumToKHelper(arr,k,sI+1);
		int[][] smallOutput2 = subsetSumToKHelper(arr,k-arr[sI],sI+1);
		int[][] output = new int[smallOutput1.length+smallOutput2.length][];
		int l = 0;
		for(int i=0;i<smallOutput1.length;i++) {
			output[l] = smallOutput1[i];
			l++;
		}
		for(int i=0;i<smallOutput2.length;i++) {
			output[l] = new int[smallOutput2[i].length+1];
			output[l][0] = arr[sI];
			for(int j=0;j<smallOutput2[i].length;j++) {
				output[l][j+1]= smallOutput2[i][j];
			}
			l++;
		}
		return output;
	}

}
