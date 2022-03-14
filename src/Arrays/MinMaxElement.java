package Arrays;

import java.util.Arrays;

public class MinMaxElement {
    static void minMax(int[] a){
        Arrays.sort(a);
        System.out.println("Minimum Element: "+a[0]);
        System.out.println("Maximum Element: "+a[a.length-1]);
    }
    public static void main(String[] args) {
        int[] a={4,1,7,11,14,9};
        minMax(a);
    }
}
