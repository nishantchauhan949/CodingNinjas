package twoDArrays;

import java.util.Scanner;

public class SpiralPrint {

	static Scanner s = new Scanner(System.in);

	public static int[][] takeInput2D(){
		int numRows = s.nextInt();
		int numCols = s.nextInt();
		int[][] input = new int[numRows][numCols];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numCols; j++){
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void spiralPrint(int matrix[][]){
		int n = matrix.length;
		//int m = matrix[0].length;

		int top = 0, bottom = n-1;
		int left = 0, right = n-1;

		while(top<= bottom && left <= right) {
			int i = left;
			while(i<= right) {
				System.out.print(matrix[top][i] + " ");
				i++;
			}
			top++;
			if(top> bottom) {
				break;
			}
//			int j = top;
//			while(j <= bottom) {
//				System.out.print(matrix[right][j]);
//				j++;
//			}
//			right--;

		}
	}

	public static void main(String[] args) {
		int a[][] = takeInput2D();
		spiralPrint(a);
	}

}
