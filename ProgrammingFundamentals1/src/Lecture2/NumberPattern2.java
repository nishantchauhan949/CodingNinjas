package Lecture2;
import java.util.Scanner;
public class NumberPattern2 {

@SuppressWarnings("resource")
public static void main(String[] args) {
		/*  1
   		   23
  	      345	n=5
 		 4567
		56789 */
	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
            for(int space=n;space>i;space--){
                System.out.print(" ");
            }
			for(int j=0;j<i;j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}

		
	}

}
