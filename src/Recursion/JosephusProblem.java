package Recursion;

import java.util.ArrayList;

public class JosephusProblem {
    static int ans;
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        int n=5,k=2;
        for(int i=0;i<n;i++)
            arrayList.add(i+1);
        solve(arrayList,n,k-1,0);
        System.out.println(ans);
    }
    static void solve(ArrayList<Integer> arrayList,  int n, int k, int index){
        if(arrayList.size()==1) {
            ans = arrayList.get(0);
            return;
        }
        index=(index+k)%n;
        arrayList.remove(index);
        solve(arrayList,n-1,k,index);

    }
}
