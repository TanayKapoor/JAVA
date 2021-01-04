package HackerEarth;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicalTree {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while(t-- > 0){
            String s = sc.next();
            int sum = Character.getNumericValue(s.charAt(0));
            for(int i=1; i<s.length()-1;i+=2){
                if(s.charAt(i)=='+'){
                    sum += Character.getNumericValue(s.charAt(i+1));
                }
                else if(s.charAt(i)=='-'){
                    sum -= Character.getNumericValue(s.charAt(i+1));
                }
            }
            arr.add(sum);
        }
        int max = -1;
        for (Integer integer : arr) {
            if (integer > max) {
                max = integer;
            }
        }
        System.out.println(max);
    }
}
