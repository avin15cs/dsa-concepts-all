package RecursionTheConcept.RecursionCall;

import java.util.Scanner;

public class DisplayArrayInReverse {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        displayArrReverse(a, n-1);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if (idx == -1)
            return;

        System.out.println(arr[idx]);
        displayArrReverse(arr, idx - 1);

    }
}