package DynamicProgramming.LCS.BottomUp;

import java.util.Arrays;

public class LPSubstringPrint {
    public static void main(String[] args) {
        String ans=longestPalindrome("cbbd");
        System.out.println(ans);
    }
    public static String longestPalindrome(String s) {
        int n=s.length();
        int[][] t=new int[n+1][n+1];
        int[] range=new int[2];
        int max=0;
        String r=String.valueOf((new StringBuilder(s)).reverse());

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==r.charAt(j-1)){
                    t[i][j]=t[i-1][j-1]+1;
                    if(max<t[i][j]){
                        max=t[i][j];
                        range[0]=i;
                        range[1]=j;
                    }
                }
                else{
                    t[i][j]=0;
                }


            }
        }

//        for(int row[]: t)
//            System.out.println(Arrays.toString(row));
//
//        System.out.println("i:"+range[0]+" "+"j:"+range[1]);
//
        String out="";
//        int i=0;
//        while(i>0 && j>0 && x.charAt(i-1)==y.charAt(j-1)){
//            out=x.charAt(i-1)+out;
//            i--;j--;
//        }
        return out;

    }
}
