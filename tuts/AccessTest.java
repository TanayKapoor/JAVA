package tuts;

class TestAccess {
    int a; //default access
    public int b; //public access
    private int c; //private access

    //        Method to access c
    void setc(int i) {
        c = i;
    }

    int getc() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        TestAccess obj = new TestAccess();
//                This will be OK as a and b are accessible
        obj.a = 10;
        obj.b = 12;
//                This won't be OK as c is private
//                obj.c = 100;
//            To access c use this
        obj.setc(200);
        System.out.println("a, b and c: " + obj.a + " " + obj.b + " " + obj.getc());
    }
}
