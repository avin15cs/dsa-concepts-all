package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;

public class PrintLPSubsequence {
    static int t[][];
    public static void main(String[] args) {
        int m = 7, n = 7;
        String x = "ABCJDBA";
        String y = String.valueOf((new StringBuilder(x)).reverse());
        t = new int[m + 1][n + 1];
        for (int[] row : t)
            Arrays.fill(row, -1);

        System.out.println("count: " + countLPS(x, y, m, n));

        for (int row[] : t)
            System.out.println(Arrays.toString(row));

        printLPS(x,y,m,n);
    }

    private static void printLPS(String x, String y, int m, int n) {

        int i=m,j=n;
        String s="";
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                s=x.charAt(i-1)+s;
                i--;j--;
            }

            else{
                if(t[i-1][j]<t[i][j-1])
                    j--;
                else
                    i--;
            }
        }
        System.out.println(s);
    }

    static int countLPS(String x,String y, int m, int n){
        if(m==0||n==0)
            return t[m][n]=0;

        if(t[m][n]!=-1)
            return t[m][n];

        if(x.charAt(m-1)==y.charAt(n-1))
            return t[m][n]=1+countLPS(x,y,m-1,n-1);

        else
            return t[m][n]=Math.max(countLPS(x,y,m-1,n),countLPS(x,y,m,n-1));
    }
}
