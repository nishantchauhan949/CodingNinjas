import java.util.Scanner;

public class FreeUse {

	public static boolean checker(int[] a) {
		boolean someBool = true;
		for(int i = 1; i < a.length; i++) {
			if (a)
		}
		return someBool;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter N");
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();

		int arr [] = new int[n];

		for(int i =0; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.println(checker(arr););
	}
}
