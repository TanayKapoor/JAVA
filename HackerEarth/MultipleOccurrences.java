package HackerEarth;

import java.util.HashMap;
import java.util.Scanner;

public class MultipleOccurrences {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for(int i=0; i<t; i++){
            int n = s.nextInt();
            int[] arr = new int[n];

            for(int j=0; j<n; j++){
                arr[j] = s.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();

            for(int j=0; j<arr.length; j++){
                map.put(arr[j],j+1);
            }

            int sum = 0;
            for(int j=0; j<arr.length; j++){
                if(map.containsKey(arr[j])){
                    int val = map.remove(arr[j]);
                    sum = sum+ (val - (j +1));
                }
            }
            System.out.println(sum);
        }

    }

}
