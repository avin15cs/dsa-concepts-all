package Walmart;

import java.util.PriorityQueue;

public class ConnectingRopes {
    public static void main(String[] args) {
        int n = 4;
        long arr[] = {4, 3, 2, 6};

        long ans=minCost(arr,n);
        System.out.println(ans);
    }
    static long minCost(long arr[], int n)
    {
        // your code here
        PriorityQueue<Long> pq=new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        long fcost=0;
        while(pq.size()>1){
            long r1=pq.remove();
            long r2=pq.remove();

            long cost=r1+r2;
            fcost+=cost;

            pq.add(cost);

        }

        return fcost;
    }

}
