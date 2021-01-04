package HackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        System.out.println((sum-arr[n-1])+" "+(sum-arr[0]));
    }
}
