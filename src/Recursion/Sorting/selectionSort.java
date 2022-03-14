package Recursion.Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int a[]={9,10,6,0,16};
        sort(a,a.length-1,0,0);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int[] a, int i, int j, int max){
        if(i==0)
            return;
        if(j<i) {
            if(a[j]>a[max]) {
                sort(a,i,j+1,j);
            }else {
                sort(a, i, j + 1, max);
            }
        }
        else {
            int temp=a[i-1];
            a[i-1]=a[max];
            a[max]=temp;
            sort(a,i-1,0,0);
        }
    }
}
