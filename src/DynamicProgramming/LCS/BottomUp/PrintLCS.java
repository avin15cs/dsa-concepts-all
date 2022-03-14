package DynamicProgramming.LCS.BottomUp;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class PrintLCS {

    public static void main(String[] args) {


    }
    public static List<Integer> longestCommonSubsequence(List<Integer> a, List<Integer> b) {
        // Write your code here
        int l1=a.size();
        int l2=b.size();
        int[][] t=new int[l1+1][l2+1];

        for(int[] i:t)
            Arrays.fill(i,0);

        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(a.get(i-1)==b.get(j-1))
                    t[i][j]=1+t[i-1][j-1];

                else
                    t[i][j]=(int)Math.max(t[i-1][j],t[i][j-1]);
            }
        }

        List<Integer> ans= new ArrayList<>();

        int i=1,j=1;
        while(i<=l1 && j<=l2){
            if(a.get(i-1)==b.get(j-1)){
                ans.add(a.get(i-1));
                i++;j++;
            }
            else{
                if(t[i][j-1]<t[i-1][j])
                    i++;

                else
                    j++;
            }
        }
        return ans;
    }
}
