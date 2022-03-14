package Recursion.MazeProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class MazeProblemSp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList< String> paths = getMazePaths(1, 1, n, m);
        System.out.println(paths);
    }

    static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc){
        if(sr>dr||sc>dc){
            ArrayList<String> bres =  new ArrayList<>();
            return bres;
        }
        if(sr==dr && sc==dc){
            ArrayList<String> bres =  new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths=  getMazePaths(sr, sc+1,dr,dc);
        ArrayList<String> vpaths=  getMazePaths(sr+1, sc,dr,dc);
        ArrayList<String> paths=new ArrayList<>();
        for(String hpath: hpaths)
            paths.add("v"+hpath);

        for(String vpath: vpaths)
            paths.add("h"+vpath);

        return paths;
    }
}
