package SlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = maxWindow(new int[]{1,2,3,-5,-1,-3,7},3);
        ArrayList<Integer> arrayList = maxWindow(new int[]{6,4,5,3,2},3);
        for(int a: arrayList)
            System.out.print(a+" ");
    }
    static ArrayList<Integer> maxWindow(int[] a, int k){
        int i=0,j=1;
        ArrayDeque<Integer> deque =new ArrayDeque<>();
        ArrayList<Integer> arrayList =  new ArrayList<>();
        deque.add(a[0]);
        while(j<a.length){
            while(!deque.isEmpty() && deque.getLast()<a[j])
                deque.removeLast();
            deque.add(a[j]);
            if(j-i+1 < k)
                j++;
            else{
                arrayList.add(deque.getFirst());
                if(deque.getFirst()==a[i])
                    deque.removeFirst();
                i++; j++;
            }
        }
        return arrayList;

    }
}
