package Arrays;

public class Sort012 {

    static void sort(int[] a){
        int len=a.length;
        int low=0,mid=0,high = len-1;
        while(mid<=high){
            if(a[mid]==0) {
                swap(a,mid,low);
                mid++;
                low++;
            } else if(a[mid]==1) {
                mid++;
            } else {
                swap(a,mid, high);
                high--;
            }
        }
    }
    static void swap(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        int[] a ={ 0,1,1,2,0,0,1,0,2,0,1,1};
        sort(a);

        for(int x: a)
            System.out.print(x+" ");
    }
}
