package easy;

import java.util.Scanner;

public class Two_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();

        int[] res = twoSum(arr,sum);

        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }



    }

    //////////////////////////////// leet code me yaha se solution start h...
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j] == target)
                {
                    arr[0] = i;
                    arr[1] = j;

                    return arr;
                }
            }
        }

        return arr;
    }
}
