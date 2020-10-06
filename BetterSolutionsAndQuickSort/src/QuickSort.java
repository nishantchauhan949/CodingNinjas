import java.util.Scanner;

public class QuickSort {

    public static int partition(int[] input, int startIndex, int endIndex) {
        int count = 0;
        int pivot = startIndex;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (input[i] <= input[pivot]) {
                count = count + 1;
            }
        }
        if (count > 0) {
            int temp = input[startIndex + count];
            input[startIndex + count] = input[pivot];
            input[startIndex] = temp;
        }

        pivot = startIndex + count;
        int i = startIndex, j = endIndex;

        while (i < pivot && j > pivot) {
            if (input[i] <= input[pivot]) {
                i++;
            } else if (input[j] > input[pivot]) {
                j--;
            } else {
                int temp = input[j];
                input[j] = input[i];
                input[i] = temp;
                i++;
                j--;
            }
        }
        return pivot;
    }

    public static void quickSortHelper(int[] input, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        } // 8 3 7 9 6 1 9 10
        int partionIndex = partition(input, startIndex, endIndex);
        quickSortHelper(input, startIndex, partionIndex - 1);
        quickSortHelper(input, partionIndex + 1, input.length - 1);
    }

    public static void quickSort(int[] input) {
        quickSortHelper(input, 0, input.length - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arrSize = s.nextInt();

        int input[] = new int[arrSize];

        for (int i = 0; i < input.length; i++) {
            input[i] = s.nextInt();
        }

        quickSort(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

}
