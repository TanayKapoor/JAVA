package com.personalnotes;

class A {
    // this is super class
    int i, j;

    void showij() {
        System.out.println("i and j are: " + i + " " + j);
    }
}

class B extends A {
    // this is sub class
    int k;

    void showk() {
        System.out.println("k is " + k);
    }

    void sum() {
        System.out.println(i + j + k);
    }
}

public class BasicsOfInheritance {
    public static void main(String[] args) {
        A superOB = new A();
        B subOB = new B();

//        Super class usage
        superOB.i = 10;
        superOB.j = 20;
        System.out.println("Super OB:");
        superOB.showij();
        System.out.println();

//        The sub class
        subOB.i = 1;
        subOB.j = 1;
        subOB.k = 1;
        System.out.println("Contents of subclass are: ");
        subOB.showk();
        System.out.println();

        System.out.println("Sum of all digits is: ");
        subOB.sum();
    }
}
