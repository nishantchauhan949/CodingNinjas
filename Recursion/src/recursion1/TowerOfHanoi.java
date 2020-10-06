package recursion1;

import java.util.Scanner;

public class TowerOfHanoi {

	public static void towerOfHanoi(int disk, char source, char auxiliary, char destination) {
//		if(disk == 1) {
//			System.out.println("move " +disk + "st disk from " +source + " to " + destination );
//		}
		
		if(disk < 1) {
			return;
		}
		
		towerOfHanoi(disk - 1, source, destination, auxiliary);
		System.out.println("move " +disk + " disk from " +source + " to " + destination );
		towerOfHanoi(disk - 1, auxiliary, source, destination);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int disk = s.nextInt();
		towerOfHanoi(disk, 'A', 'B', 'C');
	}

}
