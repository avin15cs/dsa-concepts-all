package Arrays;

import java.util.PriorityQueue;

public class KthMaximum {
    static void kthMaximum(int[] a, int k){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i : a) {
            priorityQueue.add(i);
            if (priorityQueue.size() > k)
                priorityQueue.remove();
        }
        System.out.println("Kth Maximum Element: " + priorityQueue.peek());
    }
    public static void main(String[] args) {
        int[] a={3,1,4,2,7,6};
        kthMaximum(a,3);
    }
}
