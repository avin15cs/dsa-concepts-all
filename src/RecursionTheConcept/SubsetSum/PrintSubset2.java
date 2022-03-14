package RecursionTheConcept.SubsetSum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintSubset2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int tar = Integer.parseInt(br.readLine());

        int[][] t = new int[n+1][tar+1];
        for(int[] row: t)
            Arrays.fill(row,-1);

        ArrayList<String> ans=targetSum(arr, n, "", tar,t);
        System.out.println();
        for(String s: ans)
            System.out.println(s);
    }

    // set is the subset
    // sos is sum of subset
    // tar is target
    public static ArrayList<String> targetSum(int[] arr, int n, String set, int sum,int[][] t) {
        if(sum==0) {
            ArrayList<String> bres = new ArrayList<>();
            t[n][sum] = 1;
            bres.add(set);
            return bres;
        }
        if(n==0) {
            ArrayList<String> bres = new ArrayList<>();
            t[n][sum] = 0;
            return bres;
        }
        if(t[n][sum]!=-1) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList<String> lrec=new ArrayList<>();
        ArrayList<String> rrec=new ArrayList<>();
        lrec=targetSum(arr,n-1,set,sum,t);
        if(arr[n-1]<=sum)
            rrec=targetSum(arr,n-1,set+arr[n-1]+", ",sum-arr[n-1],t);
        lrec.addAll(rrec);
        return lrec;
    }
}
