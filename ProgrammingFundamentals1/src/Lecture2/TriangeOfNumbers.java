package Lecture2;
import java.util.Scanner;

public class TriangeOfNumbers {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {

		/*           1
         			232			n=5
       			   34543
     			  4567654
   			     567898765    */

		System.out.println("Enter N");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for(int i=1;i<=n;i++) {
			
			for(int space=1;space<=n-i;space++){
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print(i+j);
			}

			for(int k=((2*i)-2);k>=i;k--) {
				System.out.print(k);
			}
			
			System.out.println();
		}

	}

}
