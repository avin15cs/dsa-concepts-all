package DynamicProgramming;

public class MaxSquare {
    public static void main(String[] args) {
//        int[][] mat={{0,0},{0,0}};
        int[][] mat={{1,0,1,1,0,1,0,0,1,1}};
        int ans=maxSquare(2,2,mat);
        System.out.println(ans);
    }
    static int maxSquare(int n, int m, int mat[][]){

        int t[][]=new int[n][m];
        int res=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==n-1 || j==m-1)
                    t[i][j]=mat[i][j];

                else{
                    if(mat[i][j]==1){
                        t[i][j]=Math.min(t[i+1][j+1],Math.min(t[i+1][j],t[i][j+1]))+1;
                        res=Math.max(t[i][j],res);
                    }
                }
            }
        }

        return res;
    }
}
