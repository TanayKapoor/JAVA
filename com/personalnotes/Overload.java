package com.personalnotes;

class OverloadDemo {
    void test() {
        System.out.println("No Parameters");
    }

    //    For one integer
    void test(int a) {
        System.out.println("a: " + a);
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

class Overload {
    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        double result;

        obj.test();
        obj.test(10);
        obj.test(10, 20);
        result = obj.test(100.11);
        System.out.println("Result of obj.test is: " + result);
    }

}