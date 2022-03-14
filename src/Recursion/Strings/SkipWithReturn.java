package Recursion.Strings;

public class SkipWithReturn {
    public static void main(String[] args) {
        String s= skip("accdaast");
        System.out.println(s);
    }
    static String skip(String ip){
        if(ip.isEmpty()){
            return "";
        }
        char c=ip.charAt(0);
        if(c == 'a')
            return skip(ip.substring(1));
        else
            return c + skip(ip.substring(1));
    }
}
