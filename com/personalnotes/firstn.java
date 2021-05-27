package com.personalnotes;

import java.util.Scanner;

public class firstn {
    public static void main(String[] args) {
        int n, i = 1;
        System.out.println("Enter number to which be printed: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
