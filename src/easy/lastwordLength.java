// https://leetcode.com/problems/length-of-last-word/

//Given a string s consisting of some words separated by some number of spaces,
// return the length of the last word in the string.
//
//  A word is a maximal substring consisting of non-space characters only.

package src.easy;

public class lastwordLength {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        int count =0;
        int n = s.length()-1;
        while (n>=0)
        {
            if(s.charAt(n) != ' ')
            {
                count++;
            }
            else
            {
                if(count > 0 && s.charAt(n) == ' ')
                {
                    break;
                }
            }
            n--;
        }

        System.out.println(count);
    }
}
