package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ClimbingStairs {
    public static int sol(int n,int curr,int[] dp) {
        if (curr==n){
            return 1;
        }
        if (curr>n){
            return 0;
        }
        if(dp[curr]!=-1){
            return dp[curr];
        }
        int c1= sol(n,curr+1,dp);
        int c2= sol(n,curr+2,dp);
        return dp[curr] = c1+c2;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(sol(n,0,dp));
    }
}
