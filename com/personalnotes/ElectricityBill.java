package com.personalnotes;

import java.util.Scanner;


public class ElectricityBill {
    public static void main(String args[]) {
        System.out.println("------------------");
        System.out.println("Tanay | 1955991593");
        System.out.println("------------------");
        double units, bill;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of units: ");
        units = sc.nextDouble();

        if (units < 100)
            bill = units * 1.20;
        else if (units < 300)
            bill = (units - 100) * 2 * 100 * 1.2;
        else
            bill = (units - 300) * 3 + 200 * 2 + 100 * 1.2;

        System.out.println("Bill to pay: ₹" + bill);


    }
}
