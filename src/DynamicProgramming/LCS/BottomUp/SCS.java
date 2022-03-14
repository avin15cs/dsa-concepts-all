package DynamicProgramming.LCS.BottomUp;

public class SCS {
    public static void main(String[] args) {
        int ans=shortestCommonSupersequence("efgh","jghi",4,4);
        System.out.println(ans);
    }
    public static int shortestCommonSupersequence(String a,String b,int m,int n)
    {
        //Your code here
        int[][] t=new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=(int)Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        int ans=m+n-t[m][n];

        return ans;
    }
}
