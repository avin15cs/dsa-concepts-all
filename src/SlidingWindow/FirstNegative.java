package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FirstNegative {
    public static void main(String[] args) {
        int[] a={10,-2,-4,12,23,-5,78,-9,0,81,9};
        int[] res=firstNegative(a,3);
        System.out.println(Arrays.toString(res));
    }
    static int[] firstNegative(int[] a, int k){
        List<Integer> list = new ArrayList<>();
        int n=a.length;
        int[] res = new int[n-k+1];
        int i=0,j=0,t=0;
        while(j<n){
            if(a[j]<0)
                list.add(a[j]);

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(list.size()==0)
                    res[t++]=0;
                else {
                    res[t++]=list.get(0);
                    if(a[i]==list.get(0))
                        list.remove(0);
                }
                i++;j++;
            }

        }
return res;
    }
}
