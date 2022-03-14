package DynamicProgramming.Knapsack01;

public class EqualSumPartition {

    public static void main(String[] args) {
        if(equalPartition(6,new int[]{1,3,4,5,6,7}))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    static boolean equalPartition(int n, int arr[])
    {
        // code here
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum%2==0){
            return subsetSum(arr,n,sum/2);

        }
        else
            return false;

    }
    static boolean subsetSum( int a[], int n, int sum){
        boolean t[][]=new boolean[n+1][sum+1];
        int i=0,j=0;
        for(i=0;i<sum;i++)
            t[0][i]=false;

        for(i=0;i<n;i++)
            t[i][0]=true;

        for(i=1;i<=n;i++){
            for(j=1;j<=sum;j++){
                if(a[i-1]<=j)
                    t[i][j]=t[i-1][j-a[i-1]]||t[i-1][j];

                else
                    t[i][j]=t[i-1][j];

            }
        }

        return t[n][sum];
    }
}
