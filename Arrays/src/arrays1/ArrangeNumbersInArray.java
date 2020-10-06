package arrays1;

import java.util.Scanner;

/* Given a number n, put all elements from 1 to n in an array in order - 1,3,.......4,2.
 *  										  0 1 2 3 4 5 6 7 8
 *  Input  = 9 -----> Output = 1 3 5 7 9 8 6 4 2				
 *  Input  = 8 -----> Output = 1 3 5 7 8 6 4 2			*/

public class ArrangeNumbersInArray {

	public static int[] arrange(int n){

		int someArr[] = new int[n];

		if(n % 2 != 0) {

			int someInt =1;

			for(int i = 0; i < n/2+1; i++) {
				someArr[i] =  someInt;
				someInt += 2;
			}
			someInt = n-1;
			for(int i = n/2+1; i < n; i++ ) {
				someArr[i] = someInt;
				someInt -= 2;
			}

		} else {
			int someInt = 1;
			
			for(int i = 0; i < n/2; i++) {
				someArr[i] = someInt;
				someInt += 2;
			}
			
			someInt = n;
			for(int i = n/2; i < n; i++ ) {
				someArr[i] = someInt;
				someInt -= 2;
			}
		}
		
		return someArr;
	}
	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = arrange(n);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] +" ");
		}		
	}

}
