package Recursion.ArrayPatterns;

import java.util.Scanner;

public class lastOccurence2 {
    public static void main(String[] args) throws Exception {
        // write your code
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(lastIndex(a,a.length-1,x));
    }

    public static int lastIndex(int[] arr, int n, int x){
        if(n<0)
            return -1;

        if(arr[n]==x)
            return n;

        int ans=lastIndex(arr,n-1,x);
        return ans;
    }
}
