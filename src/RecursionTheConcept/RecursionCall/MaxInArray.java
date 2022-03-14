package RecursionTheConcept.RecursionCall;

import java.util.Scanner;

public class MaxInArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int max=maxOfArray(a,n-1);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==-1)
            return 0;

        int tempMax=maxOfArray(arr,idx-1);
        int max=Math.max(arr[idx],tempMax);
        // return Math.max(arr[idx],maxOfArray(arr,idx-1));
        return max;
    }
}
