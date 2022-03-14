package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class NearlySorted {
    public static void main (String[] args)throws Exception {
        //code
        Scanner sc=new Scanner(System.in);
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();

            int a[] = new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int j=0;
            for(int i=0; i<n;i++){
                pq.add(a[i]);
                if(pq.size()>k){
                    System.out.print(pq.peek()+" ");
                    a[j++]=pq.remove();
                }

            }
            while(j<n){
                System.out.print(pq.peek()+" ");
                a[j++]=pq.remove();
            }
            System.out.println();
    }
}
