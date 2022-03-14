package RecursionTheConcept.MazeProblem;

//Count no of paths to reach destinatiion through down and right
//Without dp
public class MazeProblem1 {
    public static void main(String[] args) {
        int ans=count(3,3);
        System.out.println(ans);
    }
    static int count(int d, int r){
        if(d==1 || r==1){
            return 1;
        }
        int left=count(d-1,r);
        int right=count(d,r-1);

        return left+right;

    }
}
