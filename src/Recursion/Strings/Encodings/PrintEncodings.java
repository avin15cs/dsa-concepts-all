package Recursion.Strings.Encodings;

import java.util.Scanner;

public class PrintEncodings {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        printEncodings(s,"");
    }

    public static void printEncodings(String ip,String op) {

        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }


        else if(ip.length()==1){
            char c=ip.charAt(0);
            if(c=='0')
                return;

            else{
                int n=c-'0';
                char ch=(char)('a'+n-1);
                op+=ch;
                System.out.println(op);
                return;
            }

        }
        else{
            char c=ip.charAt(0);
            int n=c-'0';
            if(c=='0')
                return;


            else{
                char ch=(char)('a'+n-1);
                op+=ch;
                printEncodings(ip.substring(1),op);
                char c12=ip.charAt(1);
                int tempn=c12-'0';
                n=10*n+tempn;
                if(n<=26){
                    ch=(char)('a'+n-1);
                    op+=ch;
                    printEncodings(ip.substring(2),op);
                }
            }
        }

    }
}
