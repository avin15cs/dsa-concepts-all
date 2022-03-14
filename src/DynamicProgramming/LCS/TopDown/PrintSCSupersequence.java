package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;

public class PrintSCSupersequence {
    public static void main(String[] args) {
        int n=6,m=5;
        String s1="abcdaf";
        String s2="acbcf";
        int[][] t = new int[n+1][m+1];
        for(int row[]: t)
            Arrays.fill(row,-1);
        int lcs=getSCS(s1,s2,n,m,t);

        int scsLength=m+n-lcs;
        System.out.println("SCS Length= "+scsLength);
        for(int row[]: t)
            System.out.println(Arrays.toString(row));
        
        printSCS(s1,s2,n,m,t);
    }
    static int getSCS(String x, String y, int n, int m, int t[][]){
        if(n==0||m==0)
            return t[n][m]=0;

        if(t[n][m]!=-1)
            return t[n][m];

        if(x.charAt(n-1)==y.charAt(m-1)){
            t[n][m]=1+getSCS(x,y,n-1,m-1,t);
        }
        else{
            t[n][m]=Math.max(getSCS(x,y,n-1,m,t), getSCS(x,y,n,m-1,t));
        }
        return t[n][m];
    }
    private static void printSCS(String x, String y, int n, int m, int[][] t) {

        int i=n,j=m;
        String s="";
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                s=x.charAt(i-1)+s;
                i--;j--;
            }

            else{
                if(t[i-1][j]<t[i][j-1]) {
                    s=y.charAt(j-1)+s;
                    j--;
                }
                else {
                    s=x.charAt(i-1)+s;
                    i--;
                }
            }
        }
        System.out.println("Output: "+s);
    }
}
