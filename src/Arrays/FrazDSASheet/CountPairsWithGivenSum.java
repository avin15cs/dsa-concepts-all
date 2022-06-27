package Arrays.FrazDSASheet;

import java.util.HashMap;
import java.util.HashSet;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] a={1,1,1,1};
        int count=getPairsCount(a,4,2);
        System.out.println("Count pair Sums= "+count);
    }
    static int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(k-arr[i])){
                count+=map.get(k-arr[i]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count;
    }


}
