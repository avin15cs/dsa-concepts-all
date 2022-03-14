package RecursionTheConcept.RecursionCall;

import java.util.Scanner;

public class LastIndexInArray {
    public static void main(String[] args) throws Exception {
        //  your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int x=sc.nextInt();

        int last=lastIndex(a,n-1,x);
        System.out.println(last);
    }

    public static int lastIndex(int[] a, int idx, int x){
        if(idx==-1)
            return idx;

        if(a[idx]==x)
            return idx;

        int last=lastIndex(a,idx-1,x);
        return last;
    }

}
