package Walmart;
import java.util.Arrays;
public class UniquePathsWithObstacles {
    public static void main(String[] args) {
        int[][] grid={{1,0}};
        int ans=uniquePathsWithObstacles(grid);
        System.out.println(ans);
    }

//    public static int uniquePathsWithObstacles(int[][] grid) {
//        int m=grid.length;
//        int n=grid[0].length;
//
//        int[][] t=new int[m+1][n+1];
//
//        for(int i=1;i<=m;i++){
//            for(int j=1;j<=n;j++) {
//                if(grid[i-1][j-1]!=1)   {
//                    if(i==1||j==1)
//                        t[i][j]=1;
//                    else
//                        t[i][j]=t[i-1][j]+t[i][j-1];
//                }
//            }
//        }
//
//        return t[m][n];
//    }
    static int t[][];
    public static int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        t=new int[m+1][n+1];
        for(int[] row: t)
            Arrays.fill(row,-1);
        return solve(0,0,grid);
    }
    public static int solve(int m, int n, int[][] grid){
        if(m==grid.length-1 && n==grid[0].length-1){
            if(grid[m][n]==1)   return 0;
            return 1;
        }
        if(grid[m][n]==1)
            return 0;

        if(t[m][n]!=-1)
            return t[m][n];

        int l=0,r=0;
        if(m<grid.length-1)
            l=solve(m+1,n,grid);

        if(n<grid[0].length-1)
            r=solve(m,n+1,grid);

        return t[m][n]=l+r;
    }
}
