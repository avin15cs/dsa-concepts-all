package SlidingWindow.KSize;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class SWMaximum {
    public static void main(String[] args) {
        int a[]={1,3,-1,-3,5,3,6,7};
        int ans[]=maxSlidingWindow(a,3);
        for(int i=0;i<ans.length;i++)
            System.out.print(ans[i]+" ");
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0;
        ArrayDeque<Integer> q=new ArrayDeque<>();
        LinkedList<Integer> list = new LinkedList<>();
        int ans[]=new int[n-k+1];
        while(j<n){
            if(q.size()>0 && q.getLast()<nums[j]){
                while(q.size()>0 && q.getLast()<nums[j])
                    q.removeLast();
            }
            q.add(nums[j]);

            if(j-i+1==k) {
                ans[i]=(q.getFirst());
                if (q.getFirst() == nums[i])
                    q.removeFirst();

                i++;
            }
            j++;
        }

//        for(int s=0;s<ans.length;s++)
//            ans[s]=list.get(s);
        return ans;
    }
}
