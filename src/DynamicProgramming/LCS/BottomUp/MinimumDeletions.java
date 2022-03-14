package DynamicProgramming.LCS.BottomUp;


//Input: n = 7, str = "aebcbda"
//        Output: 2
//        Explanation: We'll remove 'e' and
//        'd' and the string become "abcba".

public class MinimumDeletions {
    public static void main(String[] args) {
        int ans=minDeletions("aebcbda",7);
        System.out.println(ans);
    }
    static int minDeletions(String a, int n)
    {
        // code here
        StringBuilder b= new StringBuilder(a);
        b.reverse();
        int t[][]=new int[n+1][n+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1))
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j]=(int)Math.max(t[i-1][j],t[i][j-1]);
            }
        }

        return n-t[n][n];
    }
}
