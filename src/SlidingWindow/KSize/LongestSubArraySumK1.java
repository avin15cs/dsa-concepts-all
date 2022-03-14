package SlidingWindow.KSize;


//Works only for positive nos in an array
public class LongestSubArraySumK1 {
    public static void main(String[] args) {
        int[] a={10,5,2,7,1,9};
        int k=15;
        int subArraySize=solve(a,a.length,k);
        System.out.println(subArraySize);
    }
    public static int solve(int a[], int n, int k) {
        //Complete the function
        int i=0,j=0,sum=0,max=Integer.MIN_VALUE;
        while(j<n){
            sum+=a[j];
            if(sum<k){
                j++;
            }
            else if(sum==k){
                max=Math.max(max,j-i+1);

                // sum-=a[i];
                //i++;
                j++;
            }
            else{
                sum-=a[i];
                i++;j++;
            }
        }
        return max;
    }
}
