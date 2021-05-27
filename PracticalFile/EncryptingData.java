package PracticalFile;

import java.util.Scanner;

public class EncryptingData {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Tanay | 1955991593");
        System.out.println("------------------");

        int num, key, s;
        Scanner sc = new Scanner(System.in);

        System.out.print("Select 1 for encryption or 2 for decryption: ");
        s = sc.nextInt();

        switch (s) {
            case 1:
                System.out.println("*** Encryption ***");
                System.out.print("Enter number to be encrypted: ");
                num = sc.nextInt();

                System.out.print("Enter key for encryption: ");
                key = sc.nextInt();

                System.out.println("Number after encryption is: " + (num << key));

                break;

            case 2:
                System.out.println("*** Decryption ***");
                System.out.print("Enter number to be decrypted: ");
                num = sc.nextInt();

                System.out.print("Enter key for decryption: ");
                key = sc.nextInt();

                System.out.println("Number after decryption is: " + (num >> key));

                break;

            default:
                System.out.println("Please select from 1 or 2!");
        }


    }
}