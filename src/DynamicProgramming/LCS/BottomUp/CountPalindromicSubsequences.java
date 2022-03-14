package DynamicProgramming.LCS.BottomUp;

public class CountPalindromicSubsequences {

    public static void main(String[] args) {
        long c=countPS("aaaa");
        System.out.println(c);
    }
    static long countPS(String s1)
    {
        // Your code here
        int n=s1.length();
        long t[][]=new long[n+1][n+1];
        String s2=((new StringBuilder(s1)).reverse()).toString();
        long count=lcs(s1,s2,n,t);
//        int count=countLcs(s1,s2,t,n);
                for(int i=1;i<n+1;i++) {
            for (int j = 1; j < n + 1; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        return count;
    }
    static long lcs(String s1, String s2, int n, long[][] t ){

        for(int i=0;i<n+1;i++)
            t[i][0]=0;
        for(int j=0;j<n+1;j++)
            t[0][j]=0;

        int mod=1000000007;

        for(int i=1;i<n+1;i++) {
            for(int j=1;j<n+1;j++){
                char c1=s1.charAt(i-1);
                char c2=s2.charAt(j-1);

                if(c1 == c2)
                    t[i][j]=1+t[i-1][j-1]%mod;

                else
                    t[i][j]=Math.max(t[i-1][j]%mod,t[i][j-1]%mod);
            }
        }
        long count=0;
        for(int i=1;i<n+1;i++)
            count+=t[n][i];

        return count;

    }
    static int countLcs(String s1, String s2, long[][] t, int n){
        int count=0;
        int i=n,j=n;
        while(i>0 && j>0){
            char c1=s1.charAt(i-1);
            char c2=s2.charAt(j-1);

            if(c1==c2) {
                count++;i--;j--;
            }

            else{
                if(t[i][j-1]>t[i-1][j])
                    j--;

                else
                    i--;
            }
        }
        return count;
    }
}
