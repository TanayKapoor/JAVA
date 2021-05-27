package com.personalnotes;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements in the array: ");
        for (int i : a) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum is: " + sum);
    }
}
