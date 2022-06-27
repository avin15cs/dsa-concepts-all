package DynamicProgramming.LinearDP.Recursive;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    static int[][] t;
    public static void main(String[] args) {
        t=new int[1001][1001];
        for(int[] ints: t)
            Arrays.fill(ints,-1);
    }
    static int solve(int[] nums, int prev, int i){
        if(i==nums.length) return 0;
        int take=0,donTake=0;
        donTake=solve(nums,prev,i+1);
        if(nums[i]>prev)
            take=1+solve(nums,nums[i],i+1);

        return Math.max(take,donTake);
    }
}
