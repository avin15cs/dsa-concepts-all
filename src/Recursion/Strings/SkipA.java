package Recursion.Strings;

public class SkipA {
    public static void main(String[] args) {
        skip("accdbaacd","");
    }
    static void skip(String ip, String op){
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }
        char c=ip.charAt(0);
        if(c == 'a')
            skip(ip.substring(1),op);
        else
            skip(ip.substring(1),op+c);
    }
}
