package Lecture2;
import java.util.Scanner;

public class NumberPattern1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		/* 1
		 * 23		n=4
		 * 345  
		 * 4567 
		 */
		
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
		
		
	}

}
