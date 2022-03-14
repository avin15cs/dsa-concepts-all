package Arrays;

import java.util.Arrays;

public class BinaryArraySorting {
    public static void main(String[] args) {
        int[] a=new int[]{1, 0, 1, 1, 0};
        binSort(a,5);
        String x=Arrays.toString(a);

        System.out.println(Arrays.toString(a));
    }
    static void binSort(int a[], int n)
    {
        int i=0, j=n-1;
        while(i<j){

            while(i<n && a[i]==0) i++;

            while(j>=0 && a[j]==1) j--;

            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            i++;j--;
        }
    }
}
