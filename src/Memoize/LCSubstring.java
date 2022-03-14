package Memoize;

import jdk.swing.interop.DropTargetContextWrapper;

import java.util.Arrays;

public class LCSubstring {
    public static void main(String[] args) {
        int m=7,n=7;
        String s1="ABCEFGH";
        String s2="BCATUQW";
        int[][] t = new int[m+1][n+1];
        Arrays.stream(t).forEach(row -> Arrays.fill(row, -1));

        for(int i=0;i<n+1;i++)
            t[i][0]=0;

        for(int i=0;i<m+1;i++)
            t[0][i]=0;

        int ans=lcs(s1,s2,m,n,t);

        System.out.println(ans-1);
    }
    static int lcs(String s1,String s2, int m,int n, int t[][]){
        if(m==0 || n==0)
            return 0;

        if(t[m][n]!=-1)
            return t[m][n];

        char c1=s1.charAt(m-1);
        char c2=s2.charAt(n-1);

        if(c1==c2) {
            t[m][n]=1+lcs(s1,s2,m-1,n-1,t);
            return t[m][n];
        }
        else{
            t[m][n]=Math.max(lcs(s1,s2,m-1,n,t),lcs(s1,s2,m,n-1,t));
            return t[m][n];
        }
//        int k1=0, k2=0;
//        if(c1==c2){
//            k1=1+lcs(s1,s2,n-1,m-1,t);
//        }
//        else{
//            k2=Math.max(lcs(s1,s2,n-1,m,t),lcs(s1,s2,n,m-1,t));
//        }
//        t[n][m]=Math.max(k1,k2);
//        return t[n][m];
    }
}
