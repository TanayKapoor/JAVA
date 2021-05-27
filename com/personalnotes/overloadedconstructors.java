package com.personalnotes;

class Box {
    double width;
    double height;
    double length;

    Box() {
        width = -1;
        height = -1;
        length = -1;
    }

    Box(double width, double height, double length) {
        System.out.println("Constructor initiated");
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume() {
        return height * width * length;
    }
}

public class overloadedconstructors {
    public static void main(String[] args) {
        Box Box1 = new Box(10, 20, 30);
        Box Box2 = new Box();

        double vol;
        System.out.println(Box1.volume());
        System.out.println(Box2.volume());
    }
}
