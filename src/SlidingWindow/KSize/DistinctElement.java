package SlidingWindow.KSize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinctElement {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = countDistinct(new int[]{1,2,1,3,4,2,3},7,4);
        for(int i: arrayList)
            System.out.print(i+" ");

    }
   static ArrayList<Integer> countDistinct(int a[], int n, int k)
    {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Map<Integer, Integer> map=new HashMap<>();
        int i=0,j=0;

        while(j<n){
            map.put(a[j],map.getOrDefault(a[j],0)+1);

            if(j-i+1<k)
                j++;

            else{
                res.add(map.size());
                if(map.get(a[i])==1)
                    map.remove(a[i]);
                else
                    map.put(a[i],map.get(a[i])-1);
                i++;j++;
            }
        }
        return res;
    }
}
