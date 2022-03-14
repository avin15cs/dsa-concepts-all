package RecursionTheConcept.FindIndex;

import java.util.ArrayList;

public class FindIndex3 {
    public static void main(String[] args) {
        int arr[] ={2,3,4,5,4};
        System.out.println(findAllIndex(arr,4,0));
    }

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index){
        ArrayList<Integer> list=new ArrayList<>();

        if(index == arr.length)
            return list;

        //this will contain for that function call only
        if(arr[index]==target)
            list.add(index);

        ArrayList<Integer> ansFromBelowCalls=findAllIndex(arr,target,index+1);
        list.addAll(ansFromBelowCalls);

        return list;
    }
}
