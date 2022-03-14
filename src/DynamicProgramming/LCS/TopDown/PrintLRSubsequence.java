package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;

public class PrintLRSubsequence {
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

        printLCS(s1,s2,n,m,t);
    }
    static int lrs(String x, String y, int n, int m, int[][] t){
        if(n==0||m==0)
            return t[n][m]=0;

        if(t[n][m]!=-1)
            return t[n][m];

        int op1=0,op2=0,op3=0;
        if(x.charAt(n-1)==y.charAt(m-1) && n!=m){
            return t[n][m]=1+lrs(x,y,n-1,m-1,t);
        }
        else{
            return t[n][m]=Math.max(lrs(x,y,n-1,m,t),lrs(x,y,n,m-1,t));
        }

    }
    private static void printLCS(String x, String y, int m, int n, int[][] t) {
        int i=m,j=n;
        StringBuilder out=new StringBuilder();
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1) && i!=j){
                out.append(x.charAt(i - 1));
                i--;j--;
            }
            else{
                if(t[i-1][j]>t[i][j-1])
                    i--;
                else
                    j--;
            }
        }
        System.out.println("Output: "+out.reverse());
    }
}
