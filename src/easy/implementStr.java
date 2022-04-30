//        https://leetcode.com/problems/implement-strstr/
//        Implement strStr().
//        Given two strings needle and haystack, return the index of the first occurrence of
//        needle in haystack, or -1 if needle is not part of haystack.
//
//        Clarification:
//        What should we return when needle is an empty string? This is a great question to ask during an interview.
//        For the purpose of this problem, we will return 0 when needle is an empty string.
//        This is consistent to C's strstr() and Java's indexOf().
package src.easy;

public class implementStr {
    public static void main(String[] args) {
        String haystack = "ujjwal";
        String needle = "l";
        int idx = 0;
        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.substring(i,haystack.length()).startsWith(needle))
            {
//                System.out.println(i);
                idx = i;
                break;
            }
        }

        if (idx > 0)
        {
            System.out.println(idx);
        }
        else
        {
            System.out.println("-1");
        }

    }
}
