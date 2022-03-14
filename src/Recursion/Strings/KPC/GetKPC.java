package Recursion.Strings.KPC;

import java.util.ArrayList;
import java.util.Scanner;

public class GetKPC {
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        ArrayList<String> ans = getKPC(s);
        System.out.println(ans);
    }

    public static ArrayList<String> getKPC(String str) {
        if(str.isEmpty()){
            ArrayList<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }
        char c=str.charAt(0);
        ArrayList<String> recAns = getKPC(str.substring(1));

        // int valC=Integer.valueOf(c);
        String s=codes[c-'0'];

        ArrayList<String> fres = new ArrayList<String>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            for(String rs: recAns){
                fres.add(ch+rs);
            }
        }

        return fres;
    }
}
