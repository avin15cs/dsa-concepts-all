package Recursion.Strings.KPC;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintKPC {
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        printKPC(s,"");
    }

    public static void printKPC(String ip, String op) {
        if(ip.isEmpty()){
            System.out.print(op+" ");
            return;
        }
        char c=ip.charAt(0);
        String s=codes[c-'0'];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            printKPC(ip.substring(1),op+ch);
        }
    }
}
