package src.easy;

import java.util.Scanner;

public class equliberiumPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextLong();
        }

        System.out.println(equilibriumPoint(arr,n));
    }

    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        int totalSum =0;
        for(int i=0;i<n;i++)
        {
            totalSum += arr[i];
        }

        int sum = 0;
        for(int i=0;i<n;i++)
        {
            if(sum == totalSum-sum-arr[i])
            {
                return i+1;
            }

            sum += arr[i];
        }

        return -1;
    }
}
