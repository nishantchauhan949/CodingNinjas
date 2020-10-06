package Assignment2;
import java.util.Scanner;

public class AssignmentNumberPattern2 {
	
	/*	1
	 * 	11
	 * 	202		n=5
	 * 	3003
	 * 	40004 */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println("1");
		
		for(int i=1;i<n;i++) {
			System.out.print(i);
			for(int j=1;j<i;j++) {
				System.out.print("0");
			}
			System.out.println(i);
		}
	
	}

}
