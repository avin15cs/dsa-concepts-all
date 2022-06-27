package Walmart;

public class UniquePathsDP {

    public static void main(String[] args) {
        int ans=uniquePaths(3,7);
        System.out.println(ans);
    }

    public static int uniquePaths(int m, int n) {
        int[][] t=new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1)
                    t[i][j]=1;
                else
                    t[i][j]=t[i-1][j]+t[i][j-1];
            }
        }

        return t[m][n];
    }
}
