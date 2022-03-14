package RecursionTheConcept.SubsetSum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintAndCountSubsets {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int tar = Integer.parseInt(br.readLine());
        ArrayList<String> ans=new ArrayList<>();
        int[][] t = new int[n+1][tar+1];
        for(int[] row: t)
            Arrays.fill(row,-1);

        int count=targetSum(arr, n, "", tar,ans,t);
        System.out.println("Count="+count);
        System.out.println();
        for(String s: ans)
            System.out.println(s);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static int targetSum(int[] arr, int n, String set, int sum, ArrayList<String> ans,int[][] t) {
        if(sum==0) {
            ans.add(set);
            return t[n][sum] = 1;
        }
        if(n==0)
            return t[n][sum]=0;

        if(t[n][sum]!=-1)
            return t[n][sum];

        if(arr[n-1]<=sum)
            return t[n][sum]=targetSum(arr,n-1,set,sum,ans,t)+targetSum(arr,n-1,set+arr[n-1]+", ",sum-arr[n-1],ans,t);

        else
            return t[n][sum]=targetSum(arr,n-1,set,sum,ans,t);

    }
}
