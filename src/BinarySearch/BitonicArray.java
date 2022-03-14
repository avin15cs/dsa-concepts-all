package BinarySearch;

public class BitonicArray {
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11 };
        int ans=solve(a,12);
        System.out.println(ans);
    }
    public static int solve(int[] a, int b) {
        int n=a.length;

        int peakNo=peakEle(a,n);
        if(b<=peakNo)
            return bs(a,n,peakNo,b,true);

        else
            return bs(a,n,peakNo,b,false);
    }
    static int peakEle(int[] a, int n){
        int i=0,j=n-1;
        while(i<=j){
            int mid= i+(j-i)/2;
            if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
                return mid;

            else if(a[i]>a[mid])
                j=mid-1;

            else
                i=mid+1;
        }
        return -1;
    }

    static int bs(int[] a, int n,int se,int key, boolean ascending){
        int i,j;
        if(ascending){
            i=0;j=se;
        }
        else{
            i=se;j=n-1;
        }
        while(i<=j){
            int mid= i+(j-i)/2;

            if(a[mid]==key)
                return mid;

            else if(a[mid]<key && ascending)
                i=mid+1;

            else if(a[mid]<key && !ascending)
                j=mid-1;

            else if(a[mid]>key && ascending)
                j=mid-1;

            else if(a[mid]>key && !ascending)
                i=mid+1;
        }
        return -1;
    }
}
