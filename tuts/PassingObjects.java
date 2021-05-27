package tuts;

class test {
    int a, b;

    test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equals(test o) {
        if (o.a == o.b) return true;
        else return false;
    }

}

public class PassingObjects {
    public static void main(String[] args) {
        test obj1 = new test(13,14);
        test obj2 = new test(14,13);
        test obj3 = new test(13,14);

        System.out.println("obj1 == obj2? "+ obj1.equals(obj2));
        System.out.println("obj1 == obj3? "+ obj1.equals(obj3));
    }
}
