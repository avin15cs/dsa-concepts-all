package Recursion.Sorting;

//Concept is similar to triangle pattern Question

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[]={9,10,6,0,16};
        bubble(a,a.length-1,0);
        System.out.println(Arrays.toString(a));
    }
    static void bubble(int[] a, int i, int j){
        if(i==0)
            return;
        if(j<i)
        {
            if(a[j]>a[j+1]) {
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            bubble(a,i,j+1);
        }
        else {
            bubble(a,i-1,0);
        }
    }
}
