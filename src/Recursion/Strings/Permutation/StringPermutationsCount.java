package Recursion.Strings.Permutation;

import java.util.ArrayList;

public class StringPermutationsCount {
//    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args) {
        int count = permutationsCount("abc","");
        System.out.println();
        System.out.println("Count: "+count);
    }
    static int permutationsCount(String ip,String op){
        if(ip.isEmpty()){
            System.out.print(op+" ");
            return 1;
        }
        int count = 0;
        char c=ip.charAt(0);
        for(int i=0;i<=op.length();i++){
            String f= op.substring(0,i);
            String l=op.substring(i);
            count+= permutationsCount(ip.substring(1),f+c+l);
        }
        return count;
    }
}
