package RecursionTheConcept.MazeProblem;

//PrintPath
public class MazeProblem2 {
    public static void main(String[] args) {
        printPath("",3,3);
    }
    static void printPath(String op, int d, int r){
        if(d==1 && r==1){
            System.out.print(op+" ");
            return;
        }
        if(d>1)
            printPath(op+'D',d-1,r);

        if(r>1)
            printPath(op+'R',d,r-1);
    }
}
