import java.util.Scanner;

public class IntersectionOfSortedArrays {

	public static void printIntersection(int a[], int b[]) {
		int i = 0, j =0;
		while(i < a.length && j < b.length) {
			if(a[i] > b[j]) {
				j++;
			} else if(a[i] < b[j]) {
				i++;
			} else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of integers you want in first array");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements");

		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Enter number of integers you want in second array");
		int m = s.nextInt();
		int b[] = new int [m];
		System.out.println("Enter the elements");

		for(int j = 0; j < m; j++) {
			b[j] = s.nextInt();
		}
		printIntersection(a, b);
	}
}
