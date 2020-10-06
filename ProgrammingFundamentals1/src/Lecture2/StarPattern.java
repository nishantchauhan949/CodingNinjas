package Lecture2;
import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
		System.out.println("Enter N");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for(int i=1;i<=n;i++) {
			
			for(int space=n;space>i;space--){
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}

			for(int k=((2*i)-2);k>=i;k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
