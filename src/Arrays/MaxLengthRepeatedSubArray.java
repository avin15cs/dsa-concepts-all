package Arrays;

public class MaxLengthRepeatedSubArray {

    public static void main(String[] args) {
        int nums1[]={1,2,3,2,1}, nums2[]={3,2,1,4,7};
        int ans=findLength(nums1, nums2);
        System.out.println(ans);
    }
    public static int findLength(int[] nums1, int[] nums2) {
        String x="",y="";
        int n=nums1.length;
        int m=nums2.length;
        for(int i=0;i<n;i++)
            x+=nums1[i];
        for(int i=0;i<m;i++)
            y+=nums2[i];

        int t[][]=new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(x.charAt(i-1)==y.charAt(j-1))
                    t[i][j]=1+t[i-1][j-1];

                else
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
            }
        }

        return t[n][m];
    }
}
