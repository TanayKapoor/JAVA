package tuts;

class methodtest{
    void test(){
        System.out.println("No numbers");
    }
    void test(double a){
        System.out.println("a is " + a);
    }
    void test(int a, int b){
        System.out.println("a is " + a + " b is " + b);
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        methodtest obj = new methodtest();
        obj.test();
        obj.test(10);
        obj.test(10, 20);
    }
}
