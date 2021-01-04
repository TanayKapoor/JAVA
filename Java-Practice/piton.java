import java.math.*;
import java.util.Scanner;
import java.lang.*;

public class piton {

    public static BigDecimal pi =  BigDecimal.ZERO;
    public static BigDecimal denom1 =  BigDecimal.ONE;
    public static BigDecimal denom2 =  BigDecimal.ONE;
    public static BigDecimal term1 =  BigDecimal.ZERO;
    public static BigDecimal term2 =  BigDecimal.ZERO;

    @SuppressWarnings("deprecation")
    public static void calcpi(int x)
    {
        for(int i=2;i<1000;i+=4)
        {
            denom1 =  BigDecimal.ONE;
            denom1 = denom1.multiply(new BigDecimal(i));
            denom1 = denom1.multiply(new BigDecimal(i+1));
            denom1 = denom1.multiply(new BigDecimal(i+2));

            denom2 =  BigDecimal.ONE;
            denom2 = denom2.multiply(new BigDecimal(i+2));
            denom2 = denom2.multiply(new BigDecimal(i+3));
            denom2 = denom2.multiply(new BigDecimal(i+4));

            term1 = new BigDecimal("4").divide(denom1, 1000, RoundingMode.HALF_UP);
            term2 = new BigDecimal("-4").divide(denom2, 1000, RoundingMode.HALF_UP);

            pi = pi.add(term1);
            pi = pi.add(term2);
        }

        pi = pi.add(new BigDecimal (3));

        pi = pi.setScale(x, BigDecimal.ROUND_HALF_UP);
    }

    @SuppressWarnings("InfiniteRecursion")
    public static void prompt()
    {
        System.out.println("How many digits of Pi");

        Scanner scanner = new Scanner(System.in);
        final int x = Integer.parseInt(scanner.nextLine());

        calcpi(x);
        System.out.println("Pi: " + pi);

        pi =  BigDecimal.ZERO;

        prompt();
    }

    public static void main(String[] args)
    {
        prompt();
    }
}