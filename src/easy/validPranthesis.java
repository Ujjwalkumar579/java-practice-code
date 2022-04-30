package easy;

import java.util.Scanner;
import java.util.Stack;

public class validPranthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();

        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else
            {
                if (st.isEmpty())
                {
                    return false;
                }
                switch(s.charAt(i))
                {
                    case ')' : char poped = st.pop();
                        if(poped == '{' || poped == '[')
                        {
                            return false;
                        }
                        break;

                    case '}' :  poped = st.pop();
                        if(poped == '(' || poped == '[')
                        {
                            return false;
                        }
                        break;

                    case ']' :  poped = st.pop();
                        if(poped == '(' || poped == '{')
                        {
                            return false;
                        }
                        break;
                }
            }

        }return st.isEmpty();
    }
}
