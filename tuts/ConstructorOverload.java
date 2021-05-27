package tuts;

class Box {
    double width;
    double height;
    double length;

    Box() {
        width = -1;
        height = -1;
        length = -1;
    }

    Box(double w, double h, double l) {
        System.out.println("Constructor 2");
        width = w;
        height = h;
        length = l;
    }

    Box(double l) {
        width = height = length = l;
    }

    double volume() {
        return height * length * width;
    }


}

public class ConstructorOverload {
    public static void main(String[] args) {
        Box box1 = new Box(10, 20, 30);
        Box box2 = new Box(30);

        System.out.println(box1.volume());
        System.out.println(box2.volume());
    }
}
