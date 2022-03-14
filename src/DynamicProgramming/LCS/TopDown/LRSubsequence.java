package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;
//Longest Repeating Subsequence
//input: "AABMBDD"
//Output: "ABD"

public class LRSubsequence {
    public static void main(String[] args) {
        int m=7,n=7;
        String s1="AABMBDD";
        String s2="AABMBDD";
        int[][] t = new int[m+1][n+1];
        for(int[] row : t)
            Arrays.fill(row,-1);
        lrs(s1,s2,n,m,t);

        for(int[] row : t)
            System.out.println(Arrays.toString(row));

    }
    static int lrs(String x, String y, int n, int m, int[][] t){
        if(n==0||m==0)
            return t[n][m]=0;

        if(t[n][m]!=-1)
            return t[n][m];

        if(x.charAt(n-1)==y.charAt(m-1) && n!=m){
            return t[n][m]=1+lrs(x,y,n-1,m-1,t);
        }
        else{
            return t[n][m]=Math.max(lrs(x,y,n-1,m,t),lrs(x,y,n,m-1,t));
        }
    }
}
