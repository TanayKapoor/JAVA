import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
    	System.out.println("Enter Number of digits yoy want to add:");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println("Enter numbers to be printed in revrse  order:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int idx = n - i - 1;
            System.out.print(arr[idx] + " ");
        }

        in.close();
    }
}