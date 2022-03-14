package DynamicProgramming.Knapsack01;

public class MinimumSumPartition {
    public static void main(String[] args) {

    }

    public static int minDifference(int arr[], int n)
    {
        // Your code goes here
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        boolean t[][]=new boolean[n+1][sum/2+1];
        subsetSum(arr,n,sum/2,t);

        int max=0;
        for(int i=0;i<sum/2+1;i++){
            if(t[n][i])
                max=i;
        }

        //Difference=Sum of Array- 2* s1
        //s1-->0-Sum/2 candidates

        return sum-2*max;
    }

    static void subsetSum(int a[],int n, int sum,boolean[][] t){
        int i=0,j=0;

        for(i=0;i<=sum;i++)
            t[0][i]=false;

        for(i=0;i<=n;i++)
            t[i][0]=true;

        for(i=1;i<=n;i++){
            for(j=1;j<=sum;j++){
                if(a[i-1]<=j)
                    t[i][j]=t[i-1][j-a[i-1]]||t[i-1][j];

                else
                    t[i][j]=t[i-1][j];
            }
        }
    }

}
