package RecursionTheConcept.RecursionCall;

import java.util.Scanner;

public class FirstIndexInArray {
    static int res=-1;
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int x=sc.nextInt();

        int first=firstIndex(a,0,x);
        System.out.println(first);
    }

    public static int firstIndex(int[] a, int idx, int x){
        if(idx==a.length)
            return -1;

        if(a[idx]==x)
            return idx;

        int first=firstIndex(a,idx+1,x);
        return first;


    }
}
