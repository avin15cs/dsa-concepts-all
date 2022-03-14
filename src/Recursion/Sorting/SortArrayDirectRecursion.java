package Recursion.Sorting;

import java.util.ArrayList;

public class SortArrayDirectRecursion {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(5);a.add(7);a.add(3);
        a.add(9);a.add(8);a.add(2);
        System.out.println("Unsorted Array: "+ a);
        sort(a);
        System.out.println("Sorted Array: "+a);
    }
    static void sort(ArrayList<Integer> a){
        if(a.size()==1)
            return;

        int temp=a.remove(a.size()-1);
        sort(a);
        insert(a,temp);
    }
    static void insert(ArrayList<Integer> a, int k) {
         if(a.size()==1 || a.get(a.size()-1)<= k){
             a.add(k);
             return;
         }
         int temp=a.remove(a.size()-1);
         insert(a,k);
         a.add(temp);
    }
}
