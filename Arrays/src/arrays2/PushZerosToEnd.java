package arrays2;

import java.util.Scanner;

public class PushZerosToEnd {
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

	public static void pushZerosAtEnd(int[] arr){
		int count=0;
		for( int i=0;i<arr.length;i++){
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		pushZerosAtEnd(arr);
		print(arr);
	}
}
