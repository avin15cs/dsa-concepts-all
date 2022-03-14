package SlidingWindow;

public class MaxSum2 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        maxSum(a,3);
    }
    static void maxSum(int a[], int k){
        int sum=0, mSum=0;
        for(int i=0;i<k;i++)
        {
            sum+=a[i];
        }
        System.out.print(sum+" ");
        for(int i=k;i<a.length;i++){
            sum-=a[i-k];
            sum+=a[i];
            System.out.print(sum+" ");
        }
    }
}
