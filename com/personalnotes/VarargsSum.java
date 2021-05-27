package com.personalnotes;

class sum {
    public int testSum(int... args) {
        int sum = 0;
        for (int x : args) sum += x;
        return sum;
    }
}

public class VarargsSum {
    public static void main(String[] args) {
        sum eg = new sum();

        int sum1 = eg.testSum(1, 2);
        System.out.println(sum1);
    }
}

