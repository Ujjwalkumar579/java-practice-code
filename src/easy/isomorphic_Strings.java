package src.easy;

import java.util.HashMap;
import java.util.Map;

public class isomorphic_Strings {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyzva";
        String t = "abcdefghijklmnopqrstuvwxyzck";

        if (isIsomorphic(s,t))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }

    public static boolean isIsomorphic(String s, String t)
    {
        String a = transform(s);
        String b = transform(t);

        System.out.println(a);
        System.out.println(b);
        return a.equals(b);
    }

    public static String transform(String s)
    {
        HashMap<Character,Integer> hm = new HashMap<>();
        StringBuilder sb =new StringBuilder();
        for(int i=0;i<s.length();++i)
        {
            if (!hm.containsKey(s.charAt(i)))
            {
                hm.put(s.charAt(i),i);
            }
            sb.append(hm.get(s.charAt(i)));
            sb.append(" ");
        }
        return sb.toString();

    }
}
