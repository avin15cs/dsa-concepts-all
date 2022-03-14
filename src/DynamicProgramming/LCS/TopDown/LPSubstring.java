package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;

//Not Working
public class LPSubstring {
    static int maxC=0;
    public static void main(String[] args) {
        int m = 7, n = 7;
        String x = "ABCJDBA";
        String y = String.valueOf((new StringBuilder(x)).reverse());
        int[][] t = new int[m+1][n+1];
        for(int row[]: t)
            Arrays.fill(row,-1);
        countLps(x,y,n,m,t);
        System.out.println("max length: "+maxC);
        for(int row[]: t)
            System.out.println(Arrays.toString(row));
    }
    static int countLps(String x, String y, int n, int m, int t[][]){
        if(n==0||m==0){
            return t[n][m]=0;
        }

        if(t[n][m]!=-1)
            return t[n][m];

        int lcs0 = 0,lcs1;
        if(x.charAt(n-1)==y.charAt(m-1)){
            t[n][m]=1+countLps(x,y,n-1,m-1,t);
        }
        else{
            t[n][m]=0;
        }

        countLps(x,y,n-1,m,t);
        countLps(x,y,n,m-1,t);
        maxC=Math.max(maxC,t[n][m]);
        return t[n][m];
    }
}
