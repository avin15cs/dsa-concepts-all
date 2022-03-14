package DynamicProgramming.LCS.BottomUp;

public class SequencePatternMatching {
    public static void main(String[] args) {
        if(isSubSequence("AXY","YADXCP"))
            System.out.println("YES");

        else
            System.out.println("NO");
    }

    static boolean isSubSequence(String a, String b) {
         int n=a.length();
         int m=b.length();
         int[][] t=new int[n+1][m+1];

         for(int i=1;i<=n;i++){
             for(int j=1;j<=m;j++){
                 char ca=a.charAt(i-1);
                 char cb=b.charAt(j-1);
                 if(ca==cb)
                     t[i][j]=t[i-1][j-1]+1;

                 else
                     t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
             }
         }
         return n==t[n][m];
    }
}
