package StringProblems;

import java.util.Locale;

public class PalindromeString {
    public static void main(String[] args) {
        int ans=isPalindrome("1a2");
        if(ans==1)
            System.out.println("Palindrome");

        else
            System.out.println("Non-Palindrome");
    }
    public static int isPalindrome(String A) {

        int i=0,j=A.length()-1;
        A=A.toLowerCase();
        while(i<j){
            char ci=A.charAt(i);
            char cj=A.charAt(j);

            if(!Character.isLetter(ci))
                i++;

            else if(!Character.isLetter(cj))
                j--;

            else if(ci!=cj)
                return 0;

            else{
                i++;
                j--;
            }
        }

        return 1;
    }
    public static int palindrome(String A) {


        A=A.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int i=0,j=A.length()-1;
        while(i<j){
            char ci=A.charAt(i);
            char cj=A.charAt(j);
            if(ci!=cj)
                return 0;

            i++;
            j--;
        }
        return 1;
    }
}
