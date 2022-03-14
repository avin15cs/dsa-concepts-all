package DynamicProgramming.Knapsack01;

public class TargetSum {
    public static void main(String[] args) {
        int ans=findTargetSumWays(new int[]{1,1,2,3},4,1);
        System.out.println(ans);
    }
    static int findTargetSumWays(int[] a , int n, int diff) {
       int arraySum=0;
        for(int i=0;i<n;i++)
            arraySum+=a[i];

        int sum=(arraySum+diff);

        if(sum%2==0)
            return countSubsetSum(a,n,sum/2);
        else
            return 0;

    }
    static int countSubsetSum(int[] a, int n, int sum){
        int t[][]=new int[n+1][sum+1];
        int i=0,j=0;
        for(i=0;i<=sum;i++)
            t[0][i]=0;

        for(i=0;i<=n;i++)
            t[i][0]=1;

        for(i=1;i<=n;i++){
            for(j=1;j<=sum;j++){
                if(a[i-1]<=j)
                    t[i][j]=t[i-1][j-a[i-1]]+t[i-1][j];

                else
                    t[i][j]=t[i-1][j];
            }
        }

        return t[n][sum];
    }
}
