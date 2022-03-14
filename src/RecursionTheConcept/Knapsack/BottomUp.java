package RecursionTheConcept.Knapsack;

public class BottomUp {
    public static void main(String[] args) {
        int w[]={3,4,5,6};
        int[] val={2,3,4,1};
        int W=8;
        int t[][]=new int[5][W+1];
        int ans=knapSack(W,w,val,4,t);
        System.out.println(ans);
    }
    static int knapSack(int W, int wt[], int val[], int n,int[][] t)
    {
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j)
                    t[i][j] = Math.max(t[i - 1][j], val[i - 1] + t[i - 1][j - wt[i - 1]]);
                else
                    t[i][j] = t[i - 1][j];

            }
        }
        return t[n][W];
    }
}
