package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        ArrayList<Long> ans=nthRowOfPascalTriangle(4);
        for(Long i: ans)
            System.out.print(i+" ");
    }
    static ArrayList<Long> nthRowOfPascalTriangle(int n) {
        // code here
        List<List<Long>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Long> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    list.add(1L);

                else
                    list.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
            }
            ans.add(list);
        }

        return (ArrayList<Long>) ans.get(n-1);
    }
}
