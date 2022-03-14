package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;

public class MinInsertionDeletion {
    public static void main(String[] args) {
        int m=4,n=3;
        String s1="heap";
        String s2="pea";
        int[][] t = new int[m+1][n+1];
        for(int row[]: t)
            Arrays.fill(row,-1);
        int lcsLength=lcs(s1,s2,m,n,t);
        int deletions=s1.length()-lcsLength;
        int insertions= s2.length()-deletions;
        System.out.println("No. of Deletions: "+deletions);
        System.out.println("No. of Insertions: "+insertions);

        for(int row[]: t)
            System.out.println(Arrays.toString(row));
    }
    static int lcs(String x, String y, int n, int m, int t[][]){
        if(n==0||m==0)
            return t[n][m]=0;

        if(t[n][m]!=-1)
            return t[n][m];

        int lcs0 = 0,lcs1;
        if(x.charAt(n-1)==y.charAt(m-1)){
            t[n][m]=1+lcs(x,y,n-1,m-1,t);
        }
        else{
            t[n][m]=Math.max(lcs(x,y,n-1,m,t), lcs(x,y,n,m-1,t));
        }
        return t[n][m];
    }
}
