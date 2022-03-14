package SlidingWindow;

import java.util.Arrays;

public class MinimumSubArraySizeSum1 {

    public static void main(String[] args) {
        int ans=minSubArrayLen(11, new int[]{1,2,3,4,5});
        System.out.println(ans);
    }
    public static int minSubArrayLen(int k, int[] nums) {
        int i=0,j=0,len=nums.length;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(i=0;i<len;i++)
            sum+=nums[i];

        if(sum<k)
            return 0;
        else{
            sum=0;i=0;
        }
        while(j<len){
            sum+=nums[j];

            if(sum<k)
                j++;

            if(sum>=k){
                while(sum>=k){
                    min=Math.min(min,j-i+1);
                    sum-=nums[i];
                    i++;j++;
                }

            }
        }
        return min;
    }

}
