package src.easy;

import java.util.Scanner;

public class Rearrange_Array_Alternately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLong();
        }
        rearrange(arr,n);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void rearrange(long arr[], int n){

        // Your code here

        for(int i=0;i<n;i++)
        {
            int j = n-1;
            int k = i;
            while(k<=j)
            {
                int temp =(int)arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k++;
                j--;
            }
        }

    }
}
