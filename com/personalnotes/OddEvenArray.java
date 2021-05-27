package com.personalnotes;

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        int n, even_sum = 0, odd_sum = 0, count_even = 0, count_odd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements in the array: ");
        for (int i : a) {
            a[i] = sc.nextInt();
            if (a[i] % 2 == 0) {
                even_sum += a[i];
                count_even += 1;
            } else {
                odd_sum += a[i];
                count_odd += 1;
            }
        }
        System.out.println("There are " + count_even + " even elements and their sum is " + even_sum);
        System.out.println("There are " + count_odd + " odd elements and their sum is " + odd_sum);
    }
}
