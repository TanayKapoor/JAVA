package com;

import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        double s1, s2, s3, s4, s5, per;
        Scanner sc = new Scanner(System.in);
        String div = new String();
        System.out.println("Enter marks of 5 subjects out of 100");
        s1 = sc.nextInt();
        s2 = sc.nextInt();
        s3 = sc.nextInt();
        s4 = sc.nextInt();
        s5 = sc.nextInt();

        per = (s1 + s2 + s3 + s4 + s5) * 0.2;
        System.out.println("Your percentage is " + per);

        div = (per >= 70) ? "First division" :
                (per >= 60 && per < 70) ? "Second division" :
                        (per >= 40 && per < 70) ? "Third division" :
                                ("You failed");
        System.out.println(div);
    }
}
