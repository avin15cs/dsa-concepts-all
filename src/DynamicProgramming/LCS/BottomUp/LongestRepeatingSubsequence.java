package DynamicProgramming.LCS.BottomUp;

public class LongestRepeatingSubsequence {
    public static void main(String[] args) {
        int ans=lrs("AABEBCDD");
    }
    public static int lrs(String s)
    {
        // code here
        int n=s.length();
        int t[][]=new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                char ca=s.charAt(i-1);
                char cb=s.charAt(j-1);
                if(ca==cb && i!=j){
                    t[i][j]=1+t[i-1][j-1];
                }
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }

            }
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(t[i][j]+"\t");
            }
            System.out.println();
        }

        return t[n][n];

    }
}
