package Walmart;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianRunningStream {
    public static void main(String[] args) {
        insertHeap(5);
        insertHeap(15);
        insertHeap(3);
        System.out.println(getMedian());
        insertHeap(15);
        System.out.println(getMedian());
        insertHeap(7);
        System.out.println(getMedian());

    }

    static PriorityQueue<Integer> minh = new PriorityQueue<>();
    static PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
    //Function to insert heap.
    public static void insertHeap(int x)
    {
        // add your code here
        if(maxh.isEmpty()||x<=maxh.peek())
            maxh.add(x);

        else
            minh.add(x);
        balanceHeaps();
    }

    //Function to balance heaps.
    public static void balanceHeaps()
    {
        // add your code here
        if(maxh.size()>minh.size()+1)
            minh.add(maxh.remove());

        else if(maxh.size()<minh.size())
            maxh.add(minh.remove());

    }

    //Function to return Median.
    public static double getMedian()
    {
        // add your code here
        if(maxh.size()==minh.size())
            return (maxh.peek()+minh.peek())/2;

        else
            return maxh.peek();

    }
}
