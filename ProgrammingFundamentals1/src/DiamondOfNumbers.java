import java.util.Scanner;

public class DiamondOfNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        int n = t/2 + 1;
        
        for(int i=1;i<=n;i++) {
        	for(int space=n;space>i;space--) {
        		System.out.print(" ");
        	}
        	for(int j=1;j<=i;j++) {
        		System.out.print("*");
        	}
        	for(int k=1;k<i;k++) {
        		System.out.print("*");
        	}
        	System.out.println();	
        }
        
      //  for(int i=)
	}

}
