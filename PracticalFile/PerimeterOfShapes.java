package PracticalFile;

import java.util.Scanner;

public class PerimeterOfShapes {
    public static void main(String[] args) {
        double r, perimeterC, pi = 3.14, s, perimeterS, h, w, perimeterR;

        System.out.println("------------------");
        System.out.println("Tanay | 1955991593");
        System.out.println("------------------");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius for circle: ");
        r = sc.nextDouble();

        System.out.print("Enter the side of the square: ");
        s = sc.nextDouble();

        System.out.print("Enter the height and width of the rectangle: ");
        h = sc.nextDouble();
        w = sc.nextDouble();

        perimeterC = 2 * (pi * r);
        perimeterS = 4 * s;
        perimeterR = 2 * (w + h);

        System.out.println("Perimeter or the circle is: " + perimeterC);
        System.out.println("Perimeter or the square is: " + perimeterS);
        System.out.println("Perimeter or the rectangle is: " + perimeterR);
    }
}
