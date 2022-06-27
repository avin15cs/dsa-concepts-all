package DynamicProgramming.Fibonacci;

import java.util.Arrays;

public class MinimumCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost={10,15,20};
        int n=cost.length;
        int[] t = new int[n];
//        Arrays.fill(t,Integer.MAX_VALUE);
        System.out.println(Math.min(solve(n-1,cost,t),solve(n-2,cost,t)));
        for(int i=0;i<n;i++)
            System.out.println(t[i]+" ");
//        System.out.println(Math.min(t[n-1],t[n-2]));
    }
    static int solve(int n, int[] cost,int[] t){
//        if(n<0)
//            return Integer.MAX_VALUE;
//
//        if(n==0 || n==1)
//            return Math.min(cost[0],cost[1]);
//
//        if(t[n]!=Integer.MAX_VALUE)
//            return t[n];
//
//        t[n]=cost[n]+Math.min(solve(n-1,cost,t),solve(n-2,cost,t));

        if (n < 0) return 0;
        if (n==0 || n==1) return t[n]=cost[n];
        if (t[n] != 0) return t[n];
        t[n] = cost[n] + Math.min(solve(n-1,cost, t), solve(n-2,cost, t));

        return t[n];
    }
}
