package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateInArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        int a[]=new int[n];
        int i=0;
        while(i<n) {
            a[i] = scanner.nextInt();
            i++;
        }

        ArrayList<Integer> ans=duplicates(a,n);
        System.out.println(ans);
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();

        int i=0;
        while(i<n){
            if(!set.contains(arr[i]))
                set.add(arr[i]);
            else {
                if(!ans.contains(arr[i]))
                    ans.add(arr[i]);

            }
            i++;
        }
        if(ans.size()==0)
            ans.add(-1);
        return ans;
    }
}
