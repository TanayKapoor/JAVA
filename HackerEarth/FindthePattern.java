package HackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class FindthePattern {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        long []a=new long[n];

        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();

        }
        Arrays.sort(a);
        System.out.println(a[0]+a[n-1]);
        
    }
}
