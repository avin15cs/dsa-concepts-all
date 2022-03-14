package Arrays;

public class ReverseArray {
    static void reverseArray(int[] a) {
        int low=0, high= a.length-1;
        while(low<high){
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;

            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        int[] a ={1,2,3,4,5};
        reverseArray(a);

        for(int x: a)
        System.out.println(x);
    }
}
