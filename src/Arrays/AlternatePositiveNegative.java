package Arrays;


import java.util.ArrayList;
import java.util.List;

public class AlternatePositiveNegative {
    static void rearrange(int arr[], int n) {
        // code here
        List<Integer> pp = new ArrayList<>();
        List<Integer> nn = new ArrayList<>();

        for(int i=0; i<arr.length;i++) {
            if(arr[i]>=0)
                pp.add(arr[i]);
            else
                nn.add(arr[i]);
        }

        int i=0,j=0,k=0;
        while(i<arr.length && j< pp.size() && k<nn.size()){
            if(i%2==0)
                arr[i++]=pp.get(j++);
            else
                arr[i++]=nn.get(k++);
        }
        while(j<pp.size())
            arr[i++]=pp.get(j++);

        while(k<nn.size())
            arr[i++]=nn.get(k++);
        for( i=0;i<n;i++)
            System.out.println(arr[i]+" ");

    }

    public static void main(String[] args) {
        int[] a = {9,4,-2,-1,5,0,-5,-3,2};
        rearrange(a,9);
    }
}
