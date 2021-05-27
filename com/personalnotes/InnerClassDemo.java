package com.personalnotes;

class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

//    This is inner class
    class Inner {
        void display() {
            System.out.println("Number: " + outer_x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}
