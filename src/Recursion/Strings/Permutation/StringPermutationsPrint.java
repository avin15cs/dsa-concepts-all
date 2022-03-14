package Recursion.Strings.Permutation;

public class StringPermutationsPrint {
    public static void main(String[] args) {
        permutations("abc","");
    }
    static void permutations(String ip, String op){
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }
        char c= ip.charAt(0);
        for(int i=0;i<=op.length();i++)
        {
            String f= op.substring(0,i);
            String l=op.substring(i);
            permutations(ip.substring(1),f+c+l);
        }

    }
}
