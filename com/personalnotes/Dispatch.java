package com.personalnotes;

class One {
    void callme() {
        System.out.println("Inside 1");
    }
}

class two extends One {
    void callme() {
        System.out.println("Inside 2");
    }
}

class three extends two {
    void callme() {
        System.out.println("Inside 3");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        One one_1 = new One();
        two two_2 = new two();
        three three_3 = new three();

        One r;
        r = one_1;
        r.callme();

        r = two_2;
        r.callme();

        r = three_3;
        r.callme();

    }
}
