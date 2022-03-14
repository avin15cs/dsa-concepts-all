package RecursionTheConcept.MazeProblem;

import java.util.Arrays;

public class MazeProblem1DP {
   static int t[][] =new int[1001][1001];

    public static void main(String[] args) {
        for(int[] row: t){
            Arrays.fill(row,-1);
        }

        int ans=count(3,3);

        System.out.println(ans);
    }
    static int count(int d, int r){
        if(d==1 || r==1){
            return 1;
        }
        if(t[d][r]!=-1)
            return t[d][r];

        int left=count(d-1,r);
        int right=count(d,r-1);

        t[d][r]=left+right;
        return t[d][r];

    }
}
