import java.util.Scanner;

public class ArrayEquilibriumIndex {

    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        System.out.print(arrayEquilibrium(arr));
    }

    public static int arrayEquilibrium(int[] arr){
        if (arr.length == 1)
            return 0;

        int pointer = 1;
        while (pointer < arr.length){
            int lhsSum = 0;
            int rhsSum = 0;
            for (int i = 0; i < pointer; i++){
                lhsSum = lhsSum + arr[i];
            }
            for (int i = pointer+1; i < arr.length; i++){
                rhsSum = rhsSum + arr[i];
            }

            if (lhsSum == rhsSum){
                return pointer;
            }
            pointer++;
        }
        return -1;
    }
}
