package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthMinimum {
    static void kthSmallest(int[] a, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
            if(pq.size()>k)
                pq.remove();
        }
        System.out.println("Kth Smallest Element: "+pq.peek());
    }
    public static void main(String[] args) {
        int[] a = {3,2,1,7,6,5};
        kthSmallest(a, 3);
    }
}
