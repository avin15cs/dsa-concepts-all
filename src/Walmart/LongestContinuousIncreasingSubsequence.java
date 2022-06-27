package Walmart;

public class LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        int ans=findLengthOfLCIS(new int[]{1,3,5,4,7});
        System.out.println(ans);
    }

    public static int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int[] t = new int[n];

        t[0] = 1;
        int max = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i])
                t[i] += t[i - 1]+1;
            else
                t[i] = 1;

            max = Math.max(max, t[i]);
        }

        return max;
    }
}