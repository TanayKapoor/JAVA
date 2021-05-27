package com.personalnotes;

class test{
    int a, b;

    test( int i, int j){
        a = i;
        b = j;
    }

//    return function
    boolean equals(test o){
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}

public class PaasingObjects {
    public static void main(String[] args) {
        test obj1 = new test(100, 122);
        test obj2 = new test(100, 122);
        test obj3 = new test(11,12);
        System.out.println("obj1 == obj2?: " + obj1.equals(obj2));
        System.out.println("obj1 == obj3?: " + obj1.equals(obj3));
    }
}
