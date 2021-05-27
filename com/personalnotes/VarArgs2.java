package com.personalnotes;

class VarArgs3 {

    static void vaTest(int... v) {
        for (int x : v) {
            System.out.print("Integers: " + x + " ");
            System.out.println();
        }
    }

    static void vaTest(boolean... v) {
        for (boolean x : v) {
            System.out.print("Bools: " + x + " ");
            System.out.println();
        }
    }

}

class VarArgs2 {
    public static void main(String[] args) {
        VarArgs3.vaTest(1, 2, 3);
        VarArgs3.vaTest(true, false, true);
    }
}