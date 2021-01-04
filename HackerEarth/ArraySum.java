package HackerEarth;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        long l=0;
        for(int i=0;i<n;i++)
        {
            int var=s.nextInt();
            l=l+var;
        }
        System.out.println(l);
    }
}
