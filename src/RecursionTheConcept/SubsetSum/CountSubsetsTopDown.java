package RecursionTheConcept.SubsetSum;

import java.util.Arrays;

public class CountSubsetsTopDown {
    public static void main(String[] args) {
        int a[] = {2,3,5,6,8,10};
        int t[][]=new int[7][11];
        for(int r[]: t)
            Arrays.fill(r,-1);
        targetSum(a,6,10,t);
        for(int r[]:t)
            System.out.println(Arrays.toString(r));
    }
    static int targetSum(int[] arr,int n,int sum,int[][] t){
        if(sum==0)
            return t[n][sum]=1;

        if(n==0)
            return t[n][sum]=0;

        if(t[n][sum]!=-1)
            return t[n][sum];

        if(arr[n-1]<=sum)
            return t[n][sum]=targetSum(arr,n-1,sum,t)+targetSum(arr,n-1,sum-arr[n-1],t);

        else
            return t[n][sum]=targetSum(arr,n-1,sum,t);
    }
}
