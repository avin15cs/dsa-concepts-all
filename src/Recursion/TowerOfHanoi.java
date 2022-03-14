package Recursion;

import java.util.Stack;

public class TowerOfHanoi {
    public static void main(String[] args) {
        toh(1, 2,3,3);
    }
    static void toh(int s, int d, int h, int n) {
        if(n==1)
        {
            System.out.println("Move Plate " + n + " from Source: " +s +" to Destination: " + d);
            return;
        }
        toh(s,h,d,n-1);
        System.out.println("Move Plate " + n + " from Source: " +s +" to Destination: " + d);
        toh(h,d,s,n-1);
    }
}
