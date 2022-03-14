package RecursionTheConcept.FindIndex;

import java.util.ArrayList;

public class FindIndexOfNo {
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,4};
        findAllIndex(arr,4,0);
    }

    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length)
            return;

        if(arr[index]==target)
            System.out.print(index+" ");

        findAllIndex(arr,target,index+1);
    }
}
