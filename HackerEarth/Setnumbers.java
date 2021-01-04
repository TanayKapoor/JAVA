package HackerEarth;

import java.util.Scanner;

public class Setnumbers {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n=scan.nextInt();
            int k=0,j,sum=0;
            for(j=0;;j++)
            {
                if(sum>n)
                {
                    sum=sum-k;
                    break;
                }
                k=(int)Math.pow(2,j);
                sum=sum+k;
            }
            System.out.println(sum);
        }
    }
}
