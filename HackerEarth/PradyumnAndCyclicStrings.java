package HackerEarth;

import java.util.Scanner;

public class PradyumnAndCyclicStrings {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int j=0;j<t;j++){
            String s = sc.nextLine();
            long add=0;
            for(int i=1;i<=s.length();i++){
                add+=i;
            }
            System.out.println(add);
        }

    }
}
