package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;

public class PrintLCSubsequence {
    static int t[][];
    public static void main(String[] args) {
        int m=7,n=7;
        String x="ABCJYUT";
        String y="BCWERJT";
        t=new int[m+1][n+1];
        for(int[] row: t)
            Arrays.fill(row,-1);

        System.out.println("count: "+countLCS(x,y,m,n));

        for(int row[]:t)
            System.out.println(Arrays.toString(row));
        printLCS2(x,y,m,n);

    }

    static int countLCS(String x, String y, int m, int n){
        if(m==0||n==0)
            return t[m][n]=0;

        if(t[m][n]!=-1)
            return t[m][n];

        if(x.charAt(m-1)==y.charAt(n-1))
            return t[m][n]=1+countLCS(x,y,m-1,n-1);

        else
            return t[m][n]=Math.max(countLCS(x,y,m-1,n),countLCS(x,y,m,n-1));
    }
    private static void printLCS(String x, String y, int m, int n) {
        int i=m,j=n;
        StringBuilder out=new StringBuilder();
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
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
    private static void printLCS2(String x, String y, int m, int n) {
        int i=1,j=1;
        StringBuilder out=new StringBuilder();
        while(i<=m && j<=m){
            if(x.charAt(i-1)==y.charAt(j-1)){
                out.append(x.charAt(i - 1));
                i++;j++;
            }
            else{
                if(t[i-1][j]>t[i][j-1])
                    i++;
                else
                    j++;
            }
        }
        System.out.println("Output: "+out);
    }
}
