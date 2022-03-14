package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {
    public static void main(String[] args) {
        int a[]={4,2,7,8,1,3};
        ArrayList<Integer> arrayList = kLargest(a,6,3);

    }
    public static ArrayList<Integer> kLargest(int arr[], int n, int k)
    {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
            if(pq.size()>k)
                pq.remove();
        }
        ArrayList<Integer> a= new ArrayList<>(pq);
        a.sort(Collections.reverseOrder());

        return a;


    }
}
