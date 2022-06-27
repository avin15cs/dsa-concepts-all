package DynamicProgramming.LinearDP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        //recursive approach
        int rec=uniquePaths(5,5);
        System.out.println("Recursive Approach: "+rec);

        int bottomUp=memoize(5,5);
        System.out.println("Bottom Up Approach: "+bottomUp);

        int topDown=dp(5,5);
        System.out.println("Top Down Approach: " +topDown);
    }

    //recursive approach
    public static int uniquePaths(int m, int n){
        if(m==1 && n==1)
            return 1;

        if(m<1 || n<1)
            return 0;

        int row=uniquePaths(m-1,n);
        int col=uniquePaths(m,n-1);

        return row+col;
    }

    //Bottom Up Approach
    public static int memoize(int m, int n){
        int[][] t = new int[m+1][n+1];
        for(int[] a: t)
            Arrays.fill(a,-1);

        solve(m, n, t);
        System.out.println("Array table: ");
        for(int[] row: t)
            System.out.println(Arrays.toString(row));
        return t[m][n];
    }

    public static int solve(int m, int n, int[][] t){
        if(m==1 && n==1)
            return t[m][n]=1;

        if(m<1 || n<1)
            return 0;

        if(t[m][n]!=-1)
            return t[m][n];

        int row=solve(m-1,n,t);
        int col=solve(m,n-1,t);

        return t[m][n]=row+col;
    }

    public static int dp(int m, int n){
        int t[][]=new int[m+1][n+1];
        Arrays.fill(t[1],1);
        for(int i=1;i<= n;i++)
            t[i][0]=1;

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                t[i][j]=t[i-1][j]+t[i][j-1];
            }
        }

        System.out.println("Array table: ");
        for(int[] row: t)
            System.out.println(Arrays.toString(row));

        return t[m][n-1];
    }
}
