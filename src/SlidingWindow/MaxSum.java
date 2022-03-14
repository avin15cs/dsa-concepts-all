package SlidingWindow;

public class MaxSum {
    public static void main(String[] args) {
        maxSum(new int[]{1, 2, 3, 4, 5},3);
    }
    static void maxSum(int[] a, int k){
        int sum=0, i=0,j=0;
        while(j<a.length){
            sum+=a[j];
            if(j-i+1<k)
                j++;
            else{
                System.out.print(sum+" ");
                sum-=a[i];
                i++;j++;
            }
        }
    }
}
