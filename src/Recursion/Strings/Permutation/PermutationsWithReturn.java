package Recursion.Strings.Permutation;

import java.util.ArrayList;

public class PermutationsWithReturn {
    public static void main(String[] args) {
        ArrayList<String> strings = permutations("abc","");
        System.out.println(strings);

    }
    static ArrayList<String> permutations(String ip, String op){
        if(ip.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(op);
            return list;
        }
        char c= ip.charAt(0);
        //local to this call
        ArrayList<String> ans=new ArrayList<>();

        for(int i=0;i<=op.length();i++)
        {
            String f= op.substring(0,i);
            String l=op.substring(i);
            ans.addAll(permutations(ip.substring(1),f+c+l));
        }
        return ans;

    }
}
