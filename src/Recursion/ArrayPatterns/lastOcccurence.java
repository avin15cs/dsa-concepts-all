package Recursion.ArrayPatterns;

import java.util.Scanner;

public class lastOcccurence {
    public static void main(String[] args) throws Exception {
        // write your code
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.println(lastIndex(a,0,x));
    }

    public static int lastIndex(int[] arr, int n, int x){
        if(n==arr.length)
            return -1;

        int ans=lastIndex(arr,n+1,x);
        if(ans!=-1)
            return ans;
        if(arr[n]==x)
            return n;

        return ans;
    }
}
