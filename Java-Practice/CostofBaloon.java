import java.util.Scanner;

public class CostofBaloon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while(a > 0){
            if(a>=1 && a<=10){
                int c1 = scanner.nextInt();
                int c2 = scanner.nextInt();
                int n = scanner.nextInt();
                int count1 = 0;
                int count2 = 0;
                for (int i=1; i<=n; i++){
                    int d = scanner.nextInt();
                    if(d==1){
                        count1++;
                    }
                    int t = scanner.nextInt();
                    if(t==1){
                        count2++;
                    }
                }
                int minimum1 = count1 * c1 + count2 * c2;
                int minimum2 = count1 * c2 + count2 * c1;
                int minimum = (minimum1<minimum2?minimum1:minimum2);

                System.out.println(minimum);

            }
            else{
                System.out.println(-1);
                a--;
            }
        }
    }
}
