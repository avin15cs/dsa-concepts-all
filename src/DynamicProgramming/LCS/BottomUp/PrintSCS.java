package DynamicProgramming.LCS.BottomUp;

public class PrintSCS {
    public static void main(String[] args) {
        String ans=shortestCommonSupersequence("cab","abac");
        System.out.println(ans);
    }

    public static String shortestCommonSupersequence(String a, String b) {

        int n=a.length();
        int m=b.length();

        int t[][]=new int[n+1][m+1];
        //calculate LCS table
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                char ca=a.charAt(i-1);
                char cb=b.charAt(j-1);

                if(ca==cb)
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j]=(int)Math.max(t[i-1][j],t[i][j-1]);
            }
        }

        //Print Table
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }

        //Print SCS

        int i=n,j=m;
        StringBuilder ans=new StringBuilder();
        while(i>0 && j>0){
            char ca=a.charAt(i-1);
            char cb=b.charAt(j-1);
            if(ca==cb){
                ans.append(a.charAt(i-1));i--;j--;
            }
            else{
                if(t[i-1][j]<t[i][j-1]){
                    ans.append(cb);j--;
                }
                else{
                    ans.append(ca);i--;
                }
            }
        }

        while(i>0) {
            ans.append(a.charAt(i-1));i--;
        }
        while(j>0) {
            ans.append(b.charAt(j-1));j--;
        }
        return (ans.reverse()).toString();

    }
}
