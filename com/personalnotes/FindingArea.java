package com.personalnotes;

class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area of fig. undefined");
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    //    Overriding area for rectangle
    double area() {
        System.out.println("area of rectangle is: ");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    //    Overriding area for triangle
    double area() {
        System.out.println("Area for triangle is: ");
        return (dim1 * dim2) / 2;
    }
}

public class FindingArea {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(11, 11);
        Triangle t = new Triangle(21, 20);

        Figure f_ref;
        f_ref = r;
        System.out.println("area is : " + f_ref.area());
        f_ref = t;
        System.out.println("area is : " + f_ref.area());
        f_ref = f;
        System.out.println("area is: " + f_ref.area());
    }
}
