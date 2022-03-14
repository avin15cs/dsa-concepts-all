package Recursion;

public class KthSymbolElement {
    public static void main(String[] args) {
        boolean output=process(4,8);
        System.out.println((output)?1:0);
    }
    static boolean process(int n, int k){
        if(n==1 && k==1)
            return false;
        int mid=(int)(Math.pow(2,n-1)/2);
        int out;
        if(k<=mid)
            return process(n-1,k);
        else
           return !process(n-1,k-mid);
    }
}
