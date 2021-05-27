package tuts;

import java.util.Scanner;

public class ifekse {
    public static void main(String[] args) {
        int a, b;
        String res = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        res = (a>b) ? "A is larger":
                "b is larger";
        System.out.println(res);
    }
}
