package DP1;

import java.util.Scanner;

public class Fibonacci1 {
    private static int fibonacci(int n, int[] arr) {
        if (n <= 1) {
            return n;
        }

        if (arr[n] > 0) {
            return arr[n];
        }

        arr[n] = fibonacci(n - 1, arr) + fibonacci(n - 2, arr);
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int[] arr = new int[n + 1];
        arr[1] = 1;

        System.out.println(fibonacci(n, arr));
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
    }
}
