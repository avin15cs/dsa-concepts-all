package BinarySearch;

public class BS {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int pos=bs(a,0,7,3);
        System.out.println(pos);
    }
    static int bs(int a[], int s, int e, int key){
        while(s<=e){
            int mid=(s+e)/2;
            if(a[mid]==key)
                return mid;
            else if(a[mid]<key)
                s=mid+1;
            else
                e=mid-1;
        }
        return -1;
    }
}
