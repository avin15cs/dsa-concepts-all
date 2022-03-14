package RecursionTheConcept.MazeProblem;

import java.util.ArrayList;

public class MazeProblemCountAndPrintPath {
    static int count=0;
    public static void main(String[] args) {

        //1st Way
        path("",3,3);
        System.out.println();
        System.out.println("No of Paths: "+count);


        //2nd way
//        ArrayList<String> arrayList = new ArrayList<>();
//
//        path(arrayList,3,3,"");
//
//        for(String s: arrayList){
//            System.out.print(s+" ");
//        }
//        System.out.println();
//        System.out.println("No of Paths: "+count);

        //3rd way
        ArrayList<String> arrayList = new ArrayList<>();
        int ans=path(arrayList,3,3,"");

        for(String s: arrayList){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("No of Paths: "+ans);

    }

    static void path(String op, int d, int r){
        if(d==1 && r==1){
            System.out.print(op+" ");
            count++;
            return;
        }
        if(d>1)
            path(op+'D',d-1,r);

        if(r>1)
            path(op+'R',d,r-1);
    }
//    static void path(ArrayList<String> op,int d, int r, String s) {
//        if(d==1 && r==1){
//            count++;
//            op.add(s);
//            return;
//        }
//
//        if(d>1)
//            path(op,d-1,r,s+'D');
//
//        if(r>1)
//            path(op,d,r-1,s+'R');
//    }

    static int path(ArrayList<String> op,int d, int r, String s) {
        if(d==1 && r==1){
//            count++;
            op.add(s);
            return 1;
        }

        int left = 0,right = 0;
        if(d>1) {
            left= path(op,d-1,r,s+'D');
        }

        if(r>1) {
            right = path(op, d, r - 1, s + 'R');
        }
        return left+right;
    }

}
