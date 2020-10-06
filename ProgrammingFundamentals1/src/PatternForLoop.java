import java.util.Scanner;
public class PatternForLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int space = n; space>i;space--) {
				System.out.print(" ");
			}
			for(int j=i;j>=0;j--) {
				System.out.print(j);
			}
			for(int k=1;k<=i;k++) {
			System.out.print(k);
		}
		System.out.println();
		}
	}
}

