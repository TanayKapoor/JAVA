package HackerEarth;

import java.util.Scanner;

public class TheGreatKian {
    public static void main(String[] args) throws Exception
    {
        Scanner in=new Scanner(System.in);
        int no=in.nextInt();
        long value;
        long f=0,l=0,mid=0;
        for(int i=1;i<=no;i++)
        {
            value=in.nextInt();
            if(i%3==1)
                f=f+value;
            if(i%3==2)
                mid=mid+value;
            if(i%3==0)
                l=l+value;
        }
        System.out.print(f+" "+mid+" "+l);
    }
}
