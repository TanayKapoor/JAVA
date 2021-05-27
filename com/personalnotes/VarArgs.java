package com.personalnotes;

class PassArray{
    static void VAtest(int[] v){
        System.out.println("Number of arguments added: " + v.length + " Numbers are: ");

        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
}

public class VarArgs {
    public static void main(String[] args) {
        int n1[] = {1, 2, 3};
        int n2[] = {1, 2};
        int n3[] = {1};

        PassArray.VAtest(n1);
        PassArray.VAtest(n2);
        PassArray.VAtest(n3);


    }
}
