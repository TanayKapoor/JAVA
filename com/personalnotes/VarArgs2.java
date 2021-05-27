package com.personalnotes;


class VarArgs3{
    
    static void vaTest(int ... v){
        for (int x : v){
            System.out.print("Integers: " + v + " ");
            System.out.println();
        }
    }

    static void vaTest(bool ... v){
        for (boolean x : v){
            System.out.print("Integers: " + v + " ");
            System.out.println();
        }
    }

}

class VarArgs2{
public static void main(String args[]){
   vaTest(1, 2, 3);
   vaTest(true, false, true);
}
}