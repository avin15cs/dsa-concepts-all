package RecursionTheConcept.Knapsack;

import java.util.Arrays;

public class TopDown {
    public static void main(String[] args) {
        int w[]={3,4,5,6};
        int[] val={2,3,4,1};
        int W=8;
        int t[][]=new int[5][9];
        for(int r[]: t)
            Arrays.fill(r,-1);

        int ans=knapSack(W,w,val,4,t);
        System.out.println(ans);
    }
    static int knapSack(int W, int wt[], int val[], int n, int[][] t)
    {
        if(W==0||n==0){
            return t[n][W]=0;
        }

        if(wt[n-1]<=W)
            return t[n][W]=Math.max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1,t),knapSack(W,wt,val,n-1,t));

        else
            return t[n][W]=knapSack(W,wt,val,n-1,t);
    }
}
