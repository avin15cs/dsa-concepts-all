package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        int ans=findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            int j=0;
            for(j=i;j<n && nums[j]==nums[i] && nums[i]==1 ;j++);

            if(j-i>1){
                max=Math.max(max,j-i);
                i=j;
            }
        }

        return max;
    }
}
