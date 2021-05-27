package tuts;

class RecursionTest{
    int value[];

    RecursionTest(int i){
        value = new int[i];
    }

    void printArray(int i){
        if (i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + value[i-1]);
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        RecursionTest ob = new RecursionTest(10);

        int i;
        for(i=0; i<10; i++) ob.value[i] = i;

        ob.printArray(10);
    }
}
