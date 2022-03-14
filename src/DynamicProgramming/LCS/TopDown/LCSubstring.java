package DynamicProgramming.LCS.TopDown;
import java.util.Arrays;

public class LCSubstring {
    static int maxC=0;
    public static void main(String[] args) {
        int m=3,n=2;
        String s1="ABC";
        String s2="AC";
        int[][] t = new int[m+1][n+1];
        for(int row[]: t)
            Arrays.fill(row,-1);
        lcs(s1,s2,m,n,t);
        System.out.println("max length: "+maxC);
        for(int row[]: t)
            System.out.println(Arrays.toString(row));
    }
    static int lcs(String x, String y, int n, int m, int t[][]){
        if(n==0||m==0){
            return t[n][m]=0;
        }

        if(t[n][m]!=-1)
            return t[n][m];

        if(x.charAt(n-1)==y.charAt(m-1)){
            t[n][m]=1+lcs(x,y,n-1,m-1,t);
        }
        else{
            t[n][m]=0;
        }

        lcs(x,y,n-1,m,t);
        lcs(x,y,n,m-1,t);
        maxC=Math.max(maxC,t[n][m]);
        return t[n][m];
    }
}
