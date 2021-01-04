package HackerEarth;

import java.util.*;
class TestClass {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String rna = sc.next();
        int c,g;
        c = g = 0;
        for(int i=0; i<l; i++){
            if(rna.charAt(i)=='C'){
                c++;
            }
            else if(rna.charAt(i)=='G'){
                g++;
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while(n-- > 0){
            int sum;
            int vac_len = sc.nextInt();
            String vac = sc.next();
            int vac_c, vac_g;
            vac_c = vac_g = 0;
            for(int i=0; i<vac_len; i++){
                if(vac.charAt(i)=='C'){
                    vac_c++;
                }
                else if(vac.charAt(i)=='G'){
                    vac_g++;
                }
            }
            sum = (c*vac_g) + (g*vac_c);
            arr.add(sum);
        }
        int max = -1;
        for (Integer x : arr){
            if (x>=max){
                max = x;
            }
        }
        System.out.println(arr.lastIndexOf(max)+1);
    }
}