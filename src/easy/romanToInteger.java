package easy;

import java.util.Scanner;
//
        //Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000

public class romanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int i=1;
        int sum =0;
        if(s.charAt(0)=='M')
        {
            sum = 1000;
        }
        else if(s.charAt(0)=='D')
        {
            sum = 500;
        }else if(s.charAt(0)=='C')
        {
            sum = 100;
        }else if(s.charAt(0)=='L')
        {
            sum = 50;
        }else if(s.charAt(0)=='X')
        {
            sum = 10;
        }else if(s.charAt(0)=='V')
        {
            sum = 5;
        }else
        {
            sum = 1;
        }
        while(i<=s.length()-1)
        {
            // sum
            switch(s.charAt(i))
            {
                case 'I': sum++;break;
                case 'V':   if(s.charAt(i-1)=='I')
                {
                    sum = sum+3;
                    break;
                }
                    sum = sum+5;break;
                case 'X':
                    if(s.charAt(i-1)=='I')
                    {
                        sum = sum+8;
                        break;
                    }
                    sum = sum+10;break;
                case 'L':   if(s.charAt(i-1)=='X')
                {
                    sum = sum+30;
                    break;
                }
                    sum = sum+50;break;
                case 'C':   if(s.charAt(i-1)=='X')
                {
                    sum = sum+80;
                    break;
                }
                    sum = sum+100;break;
                case 'D':
                    if(s.charAt(i-1)=='C')
                    {
                        sum = sum+300;
                        break;
                    }
                    sum = sum+500;break;
                case 'M': if(s.charAt(i-1)=='C')
                {
                    sum = sum+800;
                    break;
                }
                    sum = sum+1000;break;
            }
            i++;
        }
        return sum;
    }
}
