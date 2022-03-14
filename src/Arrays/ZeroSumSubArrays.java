package Arrays;

import java.util.HashMap;

public class ZeroSumSubArrays {

    public static void main(String[] args) {
        int[] a=new int[]{0, 0, 5, 5, 0, 0};
        int ans=findSubarray(a,6);
        System.out.println(ans);
    }
    public static int findSubarray(int[] arr ,int n)
    {
        //Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,count=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                count+=map.get(sum);
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return count;
    }
}
