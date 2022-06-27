package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int[] a={3,4,3,2,1};
        int ans=findPeakElement(a);
        System.out.println(ans);
    }
    public static int findPeakElement(int[] nums) {
        if(nums.length==1 || nums[0]>nums[1])
            return 0;

        if(nums[nums.length-1]>nums[nums.length-2])
            return nums.length-1;

        int i=1,j=nums.length-2;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]> nums[mid-1] && nums[mid]>nums[mid+1])
                return mid;

            else if(nums[mid-1]>nums[mid])
                j=mid-1;

            else
                i=mid+1;
        }
        return -1;
    }
}
