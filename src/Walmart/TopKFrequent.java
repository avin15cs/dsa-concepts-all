package Walmart;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,30};
        int ans[]=topKFrequent(nums,2);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
    }
    static class Pair{
        int n;
        int f;
        Pair(int n, int f){
            this.n=n;
            this.f=f;
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int[] ans;;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }


        PriorityQueue<Pair> pq=new PriorityQueue<>((a, b)->a.f-b.f);
        for(int key: map.keySet()){
            pq.add(new Pair(key,map.get(key)));
            if(pq.size()>k)
                pq.remove();
        }
        int j=0;
        ans=new int[pq.size()];
        while(!pq.isEmpty()){
            int n=pq.remove().n;
            ans[j++]=n;
        }
        return ans;
    }
}
