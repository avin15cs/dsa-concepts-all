package DynamicProgramming.LCS.BottomUp;

public class MInDeletionInsertion {

    public static void main(String[] args) {
        int ans=minOperations("heap","pea");
        System.out.println(ans);
    }
    public static int minOperations(String a, String b)
    {
        // Your code goes here
        int n=a.length();
        int m=b.length();

        int[][] t=new int[n+1][m+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1))
                    t[i][j]=1+t[i-1][j-1];

                else
                    t[i][j]=(int)Math.max(t[i-1][j],t[i][j-1]);

            }
        }

        int ans=(n-t[n][m])+(m-t[n][m]);

        return ans;
    }
}
