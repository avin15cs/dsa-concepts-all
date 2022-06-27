package DynamicProgramming.Fibonacci;
import java.util.Arrays;

public class HouseRobber2 {
    public static void main(String[] args) {
        int[] nums={1,2,1,1};
        int ans=rob(nums);
        System.out.println(ans);
    }
    public static int rob(int[] nums) {
        if(nums.length==1) return nums[0];

        int n=nums.length;
        int[] t=new int[n+1];

        Arrays.fill(t,-1);
        return solve(nums,0,0,t);


}

    static int solve(int[] nums, int s, int n,int[] t){
        if(n>nums.length-1)
            return 0;

        if(s==0 && n==nums.length-1)
            return 0;

        if(t[n]!=-1)
            return t[n];

        return t[n]=Math.max(solve(nums,s,n+1,t),nums[n]+solve(nums,s,n+2,t));
    }

}
