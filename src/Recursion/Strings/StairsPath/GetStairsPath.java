package Recursion.Strings.StairsPath;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GetStairsPath {
    public static void main(String[] args) {
        ArrayList<String> ans=paths(4);
        System.out.println(ans);
    }
    static ArrayList<String> paths(int n){
        if(n<0){
            ArrayList<String> notRequired=new ArrayList<>();
            return notRequired;
        }
        if(n==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> left=paths(n-1);
        ArrayList<String> center=paths(n-2);
        ArrayList<String> right=paths(n-3);

        //Since post processing is required we will have to use extra variable ans to combine all the ans after post processing
        ArrayList<String> fAns=new ArrayList<>();
        for(String s: left)
            fAns.add("1"+s);
        for(String s: center)
            fAns.add("2"+s);
        for(String s: right)
            fAns.add("3"+s);
        
        return fAns;
    }
}
