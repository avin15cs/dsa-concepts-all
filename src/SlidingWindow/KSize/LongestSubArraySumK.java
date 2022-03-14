package SlidingWindow.KSize;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArraySumK {
    public static void main(String[] args) {
//        int[] a={10,5,2,7,1,9};
        int[] a={-13, 0, 6, 15, 16, 2, 15, -12, 17, -16, 0, -3, 19, -3, 2, -9, -6};
        int k=15;
        int subArraySize=solve(a,a.length,k);
        System.out.println(subArraySize);
    }
    public static int solve(int a[], int n, int k) {

        int i=0,j=0,curSum=0,max=0;
        Map<Integer,Integer> map = new HashMap<>();

        while(j<n){
            curSum+=a[j];
//            map.put(curSum,j);
            if(curSum-k==0){
                max=Math.max(max,j+1);
            }
            if(map.containsKey(curSum-k)){
                max=Math.max(max,j-map.get(curSum-k));
            }
            if(!map.containsKey(curSum)) {
                map.put(curSum, j);
            }
            j++;
        }
        return max;
    }
}
