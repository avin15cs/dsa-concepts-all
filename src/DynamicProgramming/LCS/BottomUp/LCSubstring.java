package DynamicProgramming.LCS.BottomUp;

import jdk.swing.interop.DropTargetContextWrapper;

import java.util.Arrays;

public class LCSubstring {
    public static void main(String[] args) {
        int m=6,n=6;
        String s1="ABCDGH";
        String s2="ACDGHR";
        int[][] t = new int[m+1][n+1];

        for(int i=0;i<n+1;i++)
            t[i][0]=0;

        for(int i=0;i<m+1;i++)
            t[0][i]=0;

        lcs(s1,s2,m,n,t);
        int ans=lcs(s1,s2,m,n,t);
        for(int i=1;i<m+1;i++) {
            for (int j = 1; j < n + 1; j++) {
                System.out.print(t[i][j]+" ");
                ans=Math.max(ans,t[i][j]);
            }
            System.out.println();
        }
        System.out.println(ans);
    }
    static int lcs(String s1,String s2, int m,int n, int t[][]) {

        for (int i = 0; i < n + 1; i++)
            t[0][i] = 0;
        for (int i = 0; i < m + 1; i++)
            t[i][0] = 0;
        int ans=0;
        int i = 0, j = 0;
        for (i = 1; i < m + 1; i++) {
            for (j = 1; j < n + 1; j++) {
                char c1 = s1.charAt(i - 1);
                char c2 = s2.charAt(j - 1);
                if (c1 == c2) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                    ans=Math.max(ans,t[i][j]);
                } else {
//                    t[i][j]=Math.max(t[i][j-1],t[i-1][j]);
                    t[i][j] = 0;
                }
            }
        }
        return ans;
    }
}
