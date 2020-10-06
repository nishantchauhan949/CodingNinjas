package arrays2;

import java.util.Scanner;

public class MaximizeTheSum {

	public static long maximumSumPath(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        int sum1=0;
        int sum2=0;
        long maxsum =0;
        int i=0;
        int j=0;
        int k=0;
        while (i<n1 && j<n2){
            if(arr1[i]<arr2[j]) {
                sum1=sum1+arr1[i];
                i++;
            }
            else if(arr1[i]>arr2[j]){
                sum2=sum2+arr2[j];
                j++;
            }else{
                if(sum1>sum2){
                    maxsum=maxsum +sum1 + arr1[i];
                }
                else{
                    maxsum=maxsum +sum2 + arr1[i];
                }
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
        }
        while(i<n1){
            sum1=sum1+arr1[i++];
        }
        while(j<n2){
            sum2=sum2+arr2[j++];
        }
        if(sum1>sum2){
            maxsum=maxsum +sum1; 

        }else{
            maxsum=maxsum +sum2; 
        }
        return maxsum;
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int input1[] = new int[m];
		for(int i = 0; i < m; i++) {
			input1[i] = s.nextInt();
		}
		int n = s.nextInt();
		int input2[] = new int[n];
		for(int i = 0; i < n; i++) {
			input2[i] = s.nextInt();
		}
		System.out.println(maximumSumPath(input1, input2));
	}

}
