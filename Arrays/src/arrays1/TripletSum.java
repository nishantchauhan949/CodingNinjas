package arrays1;


import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	// 0 1 2 3 4 5 6 -> arr.length = 7 
	// 1 2 3 4 5 6 7    x=12
	public static void FindTriplet(int[] arr, int x){
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length ; j++) {
				for(int k = j+1; k < arr.length ; k++) {
//					if(i == j || i == k || j ==k) {
//						continue;
//					}
					if(arr[i] + arr[j] + arr[k] == x) {
						System.out.println(arr[i] + " " + arr[j] + " " + arr[k] );
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s.nextInt();
		TripletSum.FindTriplet(arr, num);
	}

}
