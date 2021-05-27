package com.personalnotes;

class factorial {
    int fact(int n) {
        int res;
        if (n == 1) return 1;
        res = fact(n - 1) * n;

        return res;
    }
}

public class recursion {
    public static void main(String[] args) {
        factorial f = new factorial();

        System.out.println("Factorial of 5 is: " + f.fact(5));
        System.out.println("Factorial of 11 is: " + f.fact(11));
        System.out.println("Factorial of 4 is: " + f.fact(4));
    }
}
