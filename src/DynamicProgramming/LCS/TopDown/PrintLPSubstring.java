package DynamicProgramming.LCS.TopDown;

import java.util.Arrays;

//Not Working
public class PrintLPSubstring {
    static int[][] t;
    static int[] val =new int[3];
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

        printLPS(x,y);
    }

    static int countLPS(String x,String y, int m, int n){
        if(m==0||n==0)
            return t[m][n]=0;

        if(t[m][n]!=-1)
            return t[m][n];

        if(x.charAt(m-1)==y.charAt(n-1))
            t[m][n]=1+countLPS(x,y,m-1,n-1);

        else
            t[m][n]=0;
        countLPS(x,y,m-1,n);
        countLPS(x,y,m,n-1);
        if(val[0]<t[m][n]){
            val[0]=t[m][n];
            val[1]=m;
            val[2]=n;
        }
        return t[m][n];
    }

    private static void printLPS(String x, String y) {

        int i=val[1], j=val[2];
        String s="";
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                s=x.charAt(i-1)+s;
                i--;j--;
            }
        }
        System.out.println(s);
    }
}
