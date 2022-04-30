package src.easy;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            if (isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int n)
    {
        if(n==1 || n==0)
            return false;

        for(int i=2;i<n;i++)
        {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
