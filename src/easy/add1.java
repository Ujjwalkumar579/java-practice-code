package src.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class add1 {
    public static void main(String[] args) {
//        ArrayList<Integer> al = new ArrayList<>();
//        al.add(9);
//        al.add(9);
//        al.add(9);
//        ArrayList<Integer> al2 = new ArrayList<>();
//        al2 = addNumber(al,al.size());
//        for(int i :al2)
//        {
//            System.out.print(i+" ");
//        }
//        StringBuilder sb = new StringBuilder();
        int[] arr = {1,8,9};
//        int carry = 0;
//        int sum =0;


        int[] ans = plusone(arr);
//        System.out.println(Arrays.toString(arr));
        for (int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }

    public static int[] plusone(int[] arr)
    {
        int i=arr.length-1;
        while(i>=0)
        {
            if(arr[i] != 9)
            {
                arr[i] = arr[i]+1;
                return arr;
            }
            arr[i] = 0;
            i--;
        }

        int[] res = new int[arr.length+1];
        res[0] = 1;
        return res;
    }

    public static ArrayList<Integer> addNumber(ArrayList<Integer> arr, int n)
    {
        StringBuilder s = new StringBuilder();
        for(int i=0;i<arr.size();i++)
        {
            s.append(arr.get(i));
        }
        int ans = Integer.parseInt(String.valueOf(s));
//        System.out.println(ans+1);
        ans = ans+1;

        ArrayList<Integer> res = new ArrayList<>();

        while(ans!=0)
        {
            res.add(ans%10);
            ans = ans/10;
        }
//        System.out.println(res);
        Collections.reverse(res);
        return res;
    }
}
