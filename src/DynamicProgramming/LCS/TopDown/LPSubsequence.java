package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;

public class LPSubsequence {
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
