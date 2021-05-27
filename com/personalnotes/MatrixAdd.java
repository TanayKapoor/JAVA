//package com.personalnotes;
//
//import java.util.Scanner;
//
//public class MatrixAdd {
//    public static void main(String[] args) {
//        int r, c, i, j, s, sum=0;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the number of rows: ");
//        r = sc.nextInt();
//
//        System.out.print("Enter the number columns: ");
//        c = sc.nextInt();
//
//        int[][] m1 = new int[r][c];
//        int[][] m2 = new int[r][c];
//        int[][] res = new int[r][c];
//
//        System.out.print("Enter the elements of FIRST matrix: ");
//        for (i = 0; i < r; i++) {
//            for (j = 0; j < c; j++)
//                m1[i][j] = sc.nextInt();
//        }
//
//        System.out.print("Enter the elements of SECOND matrix: ");
//        for (i = 0; i < r; i++) {
//            for (j = 0; j < c; j++)
//                m2[i][j] = sc.nextInt();
//
//        }
//        System.out.println("Select 1 for Addition and 2 for Multiplication: ");
//        s = sc.nextInt();
//        switch(s){
//            case 1:
//                for (i = 0; i < r; i++) {
//                    for (j = 0; j < c; j++)
//                        res[i][j] = m1[i][j] + m2[i][j];
//
//                }
//
//                System.out.println("Sum of matrices");
//                for (i = 0; i < r; i++) {
//                    for (j = 0; j < c; j++)
//                        System.out.print(res[i][j] + " ");
//                    System.out.println();
//                }
//                break;
//
//            case 2:
//        }
//    }
//
//        }
//
//
//
//    }
//}