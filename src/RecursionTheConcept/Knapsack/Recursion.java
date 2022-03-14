package RecursionTheConcept.Knapsack;

public class Recursion {
    public static void main(String[] args) {
        int w[]={3,4,5,6};
        int[] val={2,3,4,1};
        int W=8;
        int ans=knapSack(W,w,val,4);
        System.out.println(ans);
    }
    static int knapSack(int W, int wt[], int val[], int n)
    {
        if(W==0||n==0){
            return 0;
        }

        if(wt[n-1]<=W)
            return Math.max(val[n-1]+knapSack(W-wt[n-1],wt,val,n-1),knapSack(W,wt,val,n-1));

        else
            return knapSack(W,wt,val,n-1);
    }
}
