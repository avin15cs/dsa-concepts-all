package Recursion;

public class JosepheusProblem2 {
    public static void main(String[] args) {
        int ans=solve(5,2);
    }
    static int solve(int n, int k){
        if(n==1)
            return 1;

        return (solve(n-1,k)+k-1)%n+1;
    }
}
