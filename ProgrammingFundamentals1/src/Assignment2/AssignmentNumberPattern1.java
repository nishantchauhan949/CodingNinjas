package Assignment2;
import java.util.Scanner;

public class AssignmentNumberPattern1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		/* 1
		 * 11		n=4
		 * 111  
		 * 1111 
		 */
		
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("1");
			}
			System.out.println();
		}
		
		
	}

}
