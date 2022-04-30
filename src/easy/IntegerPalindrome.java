package easy;

import java.util.Scanner;

public class IntegerPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPalindrome(n))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("False");
        }
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        int i=0;
        int j = s.length()-1;

        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        // System.out.print(s);
        return true;
    }
}
