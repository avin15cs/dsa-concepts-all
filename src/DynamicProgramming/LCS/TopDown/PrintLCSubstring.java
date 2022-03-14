package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;

public class PrintLCSubstring {
    static class Count{
        int maxC;
        int r,c;
        Count(int maxC, int r, int c){
            this.maxC=maxC;
            this.c=c;
            this.r=r;
        }
    }
    static Count count=new Count(0,-1,-1);
    public static void main(String[] args) {
        int m=3,n=3;
        String s1="ABC";
        String s2="BCA";
        int[][] t = new int[m+1][n+1];
        for(int row[]: t)
            Arrays.fill(row,-1);
        findLcs(s1,s2,n,m,t);
        printlcs(t,s1,s2);
        for(int row[]: t)
            System.out.println(Arrays.toString(row));
    }



    static int findLcs(String x, String y, int n, int m, int t[][]){
        if(n==0||m==0){
            return t[n][m]=0;
        }

        if(t[n][m]!=-1)
            return t[n][m];

        if(x.charAt(n-1)==y.charAt(m-1)){
            t[n][m]=1+findLcs(x,y,n-1,m-1,t);
        }
        else{
            t[n][m]=0;
        }

        findLcs(x,y,n-1,m,t);
        findLcs(x,y,n,m-1,t);
        if(count.maxC<t[n][m]){
            count.maxC=t[n][m];
            count.r=n;
            count.c=m;
        }
        return t[n][m];
    }
    private static void printlcs(int[][] t,String x, String y) {
        int i=count.r,j= count.c;
        String out="";
        while(i>0 && j>0 && x.charAt(i-1)==y.charAt(j-1)){
            out=x.charAt(i-1)+out;
            i--;j--;
        }
        System.out.println(out);
    }
}
