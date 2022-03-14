package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;

public class PalindromeMinNoOfDeletion {
    static int[][] t;
    public static void main(String[] args) {
        String x="agbcba";
        String y= String.valueOf((new StringBuilder(x).reverse()));
        System.out.println("Input: "+x);
        System.out.println();
        int m=6;
        t=new int[m+1][m+1];
        for(int[] row: t)
            Arrays.fill(row,-1);

        int lps=getLps(x,y,m,m);
        System.out.println("DP Table: ");
        for(int[] row: t)
            System.out.println(Arrays.toString(row));

        System.out.println();
        printLps(x,y,m,m);
        System.out.println("Minimum no of Deletions: "+(m-lps));

    }
    static int getLps(String x,String y, int m,int n){
        if(m==0||n==0)
            return t[m][n]=0;

        if(t[m][n]!=-1)
            return t[m][n];

        if(x.charAt(m-1)==y.charAt(n-1))
            return t[m][n]=1+getLps(x,y,m-1,n-1);

        else
            return t[m][n]=Math.max(getLps(x,y,m-1,n),getLps(x,y,m,n-1));
    }
    static void printLps(String x, String y, int m, int n){
        int i=m,j=n;
        StringBuilder out= new StringBuilder();
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                out.insert(0, x.charAt(i - 1));
                i--;j--;
            }
            else{
                if(t[i-1][j]<t[i][j-1])
                    j--;
                else
                    i--;
            }
        }
        System.out.println("Output: "+out);
    }
}
