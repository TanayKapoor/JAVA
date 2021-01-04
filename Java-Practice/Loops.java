import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
    	System.out.print("Enter a number:");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        for (int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }
}