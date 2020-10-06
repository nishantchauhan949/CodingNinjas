package test1;

import java.util.Scanner;

public class Ques1 {
	/*    1
  		 212			n=4
 	   32123
     4321234   */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		for (int i = 1; i<=n; i++) {
			for(int space = 1; space <= n-i; space++ ) {
				System.out.print(" ");
			}
			int p =i;
			for(int j = 1; j <= i; j++) {
				System.out.print(p--);
			}
			p++;
			for(int j = 1; j < i; j++) {
				System.out.print(++p);
			}
			System.out.println();
		}

	}

}
