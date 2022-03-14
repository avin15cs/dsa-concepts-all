package BinarySearch;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int a[]={1,2,3,3,3,4,5,6,7};
        System.out.println(getIndex(a,0,a.length-1,3,true));
        System.out.println(getIndex(a,0,a.length-1,3,false));
    }
    static int getIndex(int[] a, int f, int l, int x, boolean first){
        int res=-1;
        while(f<=l){
            int mid=(f+l)/2;
            if(a[mid]==x){
                res=mid;
                if(first)
                    l =mid-1;
                else
                    f=mid+1;
            }
            else if(a[mid]<x)
                f=mid+1;

            else
                l=mid-1;
        }
        return res;
    }
}
