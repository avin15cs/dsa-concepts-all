package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;

public class SCSupersequence {
    public static void main(String[] args) {
        int n=4,m=3;
        String s1="geek";
        String s2="eke";
        int[][] t = new int[n+1][m+1];
        for(int row[]: t)
            Arrays.fill(row,-1);
        int lcs=getLcs(s1,s2,n,m,t);

        int scsLength=m+n-lcs;
        System.out.println("SCS Length= "+scsLength);
        for(int row[]: t)
            System.out.println(Arrays.toString(row));
    }
    static int getLcs(String x, String y, int n, int m, int t[][]){
        if(n==0||m==0)
            return t[n][m]=0;

        if(t[n][m]!=-1)
            return t[n][m];

        if(x.charAt(n-1)==y.charAt(m-1)){
            t[n][m]=1+getLcs(x,y,n-1,m-1,t);
        }
        else{
            t[n][m]=Math.max(getLcs(x,y,n-1,m,t), getLcs(x,y,n,m-1,t));
        }
        return t[n][m];
    }
}
