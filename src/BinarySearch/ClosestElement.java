package BinarySearch;

public class ClosestElement {
    public static void main(String[] args) {
        int dif=findClosest(new int[]{5,14,15,15},4,3);
        System.out.println(dif);
    }
    public static int findClosest(int a[], int n, int key)
    {
        // Complete the function
        int low=0,high=n-1,ans=-1;
        while(low<=high){
            int mid=low + (high-low)/2;
            if(a[mid]==key){
                ans=mid;
                break;
            }
            else if(a[mid]<key)
                low=mid+1;
            else if(a[mid]>key)
                high=mid-1;
        }
        if(high==-1)
            return a[0];
        else if(low==n)
            return a[n-1];
        else{
            int n1=Math.abs(key-a[low]);
            int n2=Math.abs(key-a[high]);
            return a[((ans!=-1)?ans:((n1>n2)?high:low))];
        }
    }
}
