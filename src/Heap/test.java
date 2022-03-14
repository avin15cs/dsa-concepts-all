package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class test {
    public static void main(String[] args) {
        int ans=solution(new int[]{5, 19, 8, 1});
        System.out.println(ans);
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        int ans=0,sum=0;
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<A.length;i++){
            pq.add(A[i]);
            sum+=A[i];
        }
        int temp=sum;
        while(temp>sum/2){
            int ele=pq.remove();
            temp=temp-ele;
            ele=ele/2;
            temp=temp+ele;
            pq.add(ele);
            ans++;
        }
        return ans;
    }
}
