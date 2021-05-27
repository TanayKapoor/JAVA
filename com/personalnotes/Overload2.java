package com.personalnotes;

class OverloadDemo2 {
    void test() {
        System.out.println("No Parameters");
    }

    //    For two integers
    void test(int a, int b) {
        System.out.println("a: " + a + " b: " + b);
    }

    //    For double
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

public class Overload2 {
    public static void main(String[] args) {
        OverloadDemo2 obj = new OverloadDemo2();
        int i = 28;
        obj.test(i);
    }
}
