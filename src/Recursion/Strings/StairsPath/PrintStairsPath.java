package Recursion.Strings.StairsPath;

import java.util.ArrayList;

public class PrintStairsPath {
    public static void main(String[] args) {
        printPaths(4,"");
    }
    static void printPaths(int n, String op){
        if(n<0)
            return;
        if(n==0){
            System.out.print(op+" ");
            return;
        }
        printPaths(n-1,"1"+op);
        printPaths(n-2,"2"+op);
        printPaths(n-3,"3"+op);

    }
}
