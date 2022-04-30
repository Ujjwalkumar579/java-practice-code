package easy;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(arr));
    }

    public static String longestCommonPrefix(String[] strs) {
        String cs = strs[0];

        for(int i=1;i<strs.length;i++)
        {
            while(!strs[i].startsWith(cs))
            {
                cs = cs.substring(0,cs.length()-1);
            }
        }
        return cs;

    }
}
