package Assignment2;
import java.util.Scanner;

public class AssignmentNumberPattern3 {
	
	/* 1
	   11	
       121	n=5
       1221
       12221  */
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		System.out.println("1");
		
		for(int i=1;i<n;i++) {
			System.out.print("1");
			for(int j=1;j<i;j++) {
				System.out.print("2");
			}
			System.out.println("1");
		}
	}

}
