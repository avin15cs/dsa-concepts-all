package DynamicProgramming.Fibonacci;

public class HouseRobber1 {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        int ans=rob(nums);
        System.out.println(ans);
    }

    public static int rob(int[] nums) {
        int n=nums.length;
        int t[]=new int[2];

        for(int i=0;i<2;i++){
            for(int j=i;j<n;j=j+2){
                t[i]+=nums[j];
            }
        }

        return Math.max(t[0],t[1]);
    }
}
