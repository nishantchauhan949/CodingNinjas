package lecture;

public class QuickSort {

	private static int partition(int input[], int startIndex, int endIndex) {
		int count = 0;
		for(int i = startIndex; i <= endIndex; i++) {
			if(input[startIndex] >= input[i]) {
				count++;
			}
		}
		int temp = input[count];
		input[count] = input[startIndex];
		input[startIndex] = temp;

		for(int i = startIndex; i < count; ) {
			for(int j = endIndex; j > count; ) {
				if(input[i] > input[count]) {
					if(input[j] <= input[count]) {
						int temp2 = input[j];
						input[j] = input[i];
						input[i] = temp2;
						i++;
						j--;
					} else {
						j--;
					}
				} else {
					i++;
				}
			}
		}
		return count;
	}

	public static void quickSortHelper(int input[], int startIndex, int endIndex) {
		if(startIndex >= endIndex) {
			return;
		}

		//partition
		int pivotIndex = partition(input, startIndex, endIndex);
		quickSortHelper(input, startIndex, pivotIndex - 1);
		quickSortHelper(input, pivotIndex + 1, endIndex);
	}

	public static void quickSort(int input[]) {
		quickSortHelper(input, 0, input.length-1);
	}

	public static void main(String[] args) {
		int arr[] = {3,4,5,1,9};
		quickSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
