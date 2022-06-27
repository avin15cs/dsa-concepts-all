package Walmart;
import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        int ans=uniquePaths(3,7);
        System.out.println(ans);
    }

    static int[][] t;
    public static int uniquePaths(int m, int n) {
        t=new int[m+1][n+1];
        for(int[] arr: t)
            Arrays.fill(arr,-1);

        return solve(m,n);
    }

    public static int solve(int m, int n){
        if(m==1 && n==1){
            // count++;
            return 1;
        }
        if(t[m][n]!=-1)
            return t[m][n];

        int l=0,r=0;
        if(m>1)
            l=solve(m-1,n);

        if(n>1)
            r=solve(m,n-1);

        return t[m][n]=l+r;
    }
}
