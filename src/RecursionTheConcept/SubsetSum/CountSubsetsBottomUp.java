package RecursionTheConcept.SubsetSum;

import java.util.Arrays;

public class CountSubsetsBottomUp {
    static int[][] t;
    public static void main(String[] args) {
        int a[] = {2,3,5,6,8,10};
        targetSum(a,5,11);
        for(int r[]:t)
            System.out.println(Arrays.toString(r));
    }
    static void targetSum(int[] arr,int n,int sum){
        t=new int[n+1][sum+1];
        for(int i=0;i<=n;i++)
            t[i][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(arr[i-1]<=j)
                    t[i][j]=t[i-1][j]+t[i-1][j-arr[i-1]];
                else
                    t[i][j]=t[i-1][j];
            }
        }
    }
}
