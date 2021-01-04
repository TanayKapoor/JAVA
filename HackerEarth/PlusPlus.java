package HackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlusPlus {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine().trim());
        int n = Integer.parseInt(st1.nextToken().trim());
        int m = Integer.parseInt(st1.nextToken().trim());
        int[][] array = new int[n][m];
        int maxSum = 0;
        for(int i=0; i<n; i++)
        {
            st1 = new StringTokenizer(br.readLine().trim());
            for(int j=0; j<m; j++)
                array[i][j] = Integer.parseInt(st1.nextToken().trim());
        }

        for(int i = 1 ; i < n-1 ; i++)
        {
            for(int j = 1 ; j < m-1 ; j++)
            {
                for(int k = i+2 ; k < n-1 ; k++)
                { //As plus sign can't overlap , k = i+2
                    for(int l = 1 ; l < m-1 ; l++)
                    {
                        //if (k > i || l > j) {
                        int tempSum = array[i][j]*array[k][l]
                                + array[i-1][j]*array[k-1][l]
                                + array[i][j-1]*array[k][l-1]
                                + array[i+1][j]*array[k+1][l]
                                + array[i][j+1]*array[k][l+1];
                        maxSum = Math.max(maxSum,tempSum) ;
//System.out.print(maxSum +" "+i+" "+j+" kl"+k+" "+l+"\n");
                    }
                }
            }
        }
        System.out.print(maxSum);
    }
}
