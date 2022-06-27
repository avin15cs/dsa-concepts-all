package DynamicProgramming.LIS;
import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] a={0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15};
        int ans=longestSubsequence(a.length,a);
        System.out.println(ans);
    }

    static int longestSubsequence(int size, int a[])
    {
        // code here
        int t[]=new int[size];

        Arrays.fill(t,1);
        int max=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<i;j++){
                if(a[j]<a[i])
                    t[i]=Math.max(t[j]+1,t[i]);
            }
            max=Math.max(t[i],max);
        }

        return max;
    }
}
