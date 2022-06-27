package Walmart;
import java.util.Arrays;

public class CountNoOfLIS {
    public static void main(String[] args) {
        int ans=findNumberOfLIS(new int[]{2,2,2,2,2});
        System.out.println(ans);
    }

    public static int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        int[] t=new int[n];
//        t[0]=1;
        Arrays.fill(t,1);
        int[] count=new int[n];
        Arrays.fill(count,1);

        int overallMax=0;

        for(int i=0;i<n;i++){

            for(int j=0;j<i;j++){

                if(nums[j]<nums[i]){
                    if(t[j]+1>t[i]){
                        t[i]=t[j]+1;
                        count[i]=count[j];
                    }
                    else if(t[j]+1==t[i])
                        count[i]+=count[j];

                }
            }
            overallMax=Math.max(t[i],overallMax);

        }
        int mCount=0;
        for(int i=0;i<n;i++)
            if(t[i]==overallMax)
                mCount+=count[i];

        return mCount;
    }
}
