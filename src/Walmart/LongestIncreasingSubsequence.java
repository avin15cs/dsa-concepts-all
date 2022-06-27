package Walmart;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int ans=findNumberOfLIS(new int[]{2,2,2,2,2});

        System.out.println(ans);
    }
    public static int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] t=new int[n];
        t[0]=1;
        // int[] count=new int[n];
        int overallMax=0;
        for(int i=0;i<n;i++){

            for(int j=0;j<i;j++){

                if(nums[j]<nums[i]){
                    t[i]=Math.max(t[j]+1,t[i]);
                }
            }
            overallMax=Math.max(t[i],overallMax);
        }

        int k=0;
        for(int i=0;i<n;i++)
            if(t[i]==overallMax-1)
                k++;

        return (overallMax==1)?nums.length:k;
    }
}
