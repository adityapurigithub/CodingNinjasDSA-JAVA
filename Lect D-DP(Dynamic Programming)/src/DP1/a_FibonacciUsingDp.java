/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP1;

import java.util.Scanner;

/**
 *
 * @author Aditya
 */
public class a_FibonacciUsingDp {
 //In Dynamic prog. we basically store the identical substructure..
    // this process of recursion + storing is Known As  MEMOIZATION...
    // Dynamiic programming can be only applied if there are overlapping subproblems...
    // if there are unique call for each element then DP can not be applied..
    // for DP optimal substructure is important and overlapping subproblem is very necessary...

    public static int Fibbonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int ans1 = Fibbonacci(n - 1);
        int ans2 = Fibbonacci(n - 2);
        int res = ans1 + ans2;
        return res;
    }  //O(n^2)
    
    private static int FibbDP(int n,int dp[]) {  //  time..O(n)   space...O(2n)=O(n)..
  /*In dynamic programming we basically store the same identical subproblems result (in array).. 
     it helps to reduce the time complexity...
        
        */
        if(n==0||n==1){
            return n;
        }
        int ans1,ans2;
        if(dp[n-1]==-1){
            ans1=FibbDP(n-1, dp);
            dp[n-1]=ans1;
        }
        else{
            ans1=dp[n-1];
        }
        if(dp[n-2]==-1){
            ans2=FibbDP(n-2, dp);
            dp[n-2]=ans2;
        }
        else{
            ans2=dp[n-2];
        }
        int myans=ans1+ans2;
        return myans;
        
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dp[] = new int[n + 1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }

//        int ans=fact(n);
        int ans = FibbDP(n,dp);

        System.out.println(ans);

    }

    

}
