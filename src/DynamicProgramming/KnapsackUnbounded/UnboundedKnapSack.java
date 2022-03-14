package DynamicProgramming.KnapsackUnbounded;

public class UnboundedKnapSack {

    public static void main(String[] args) {
        int ans=knapSack(2,3,new int[]{1,1},new int[]{2,1});
        System.out.println(ans);
    }
    static int knapSack(int n, int w, int val[], int wt[])
    {
        // code here
        int t[][]=new int[n+1][w+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=w;j++){
                if(wt[i-1]<=j){
                    t[i][j]=Math.max(t[i-1][j],val[i-1]+t[i][j-wt[i-1]]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }

        return t[n][w];
    }
}
