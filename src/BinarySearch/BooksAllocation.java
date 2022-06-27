package BinarySearch;

public class BooksAllocation {
    public static void main(String[] args) {
        int[] a={12,34,67,90};
        int ans=findPages(a,4,2);
        System.out.println(ans);
    }
    public static int findPages(int[]a,int n,int m)
    {
        //Your code here
        int ans=-1;
        int low=0,high=0;
        for(int i=0;i<n;i++){
            high+=a[i];
            low=Math.max(low,a[i]);
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            if(isValid(a,mid,m)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] a,int mid, int k){
        int count=1;
        int sum=0;
        for(int val: a){
            if(sum+val<=mid)
                sum+=val;
            else{
                count++;
                sum=val;
            }
        }

        return count<=k;
    }
}
