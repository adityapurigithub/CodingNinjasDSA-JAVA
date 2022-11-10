/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP2;

/**
 *
 * @author Aditya
 */
public class a_MinCost {
    public static int minCostPath(int[][] input ,int i,int j) {
        int m=input.length;
        int n=input[0].length;
        
        //base..case/..
        if(i>=m||j>=n){
            return Integer.MAX_VALUE;
        }
        
        //special case.. when reached at the last row,column..
        if(i==m-1&&j==n-1){
            return input[i][j];
        }
        
        
        int ans1=minCostPath(input, i+1, j);
        int ans2=minCostPath(input, i, j+1);
        int ans3=minCostPath(input, i+1, j+1);
        
        int myAns=input[i][j]+Math.min(ans1, Math.min(ans2, ans3));
        return myAns;
        
        
    }
    
       public static int minCostPathMEMOIZATION(int[][] input ,int i,int j,int dp[][]) {
           int m=input.length;
           int n=input[0].length;
           
           //special case..
           if(i==m-1&&j==n-1){
               return input[i][j];
           }
           //base case..
           if(i>=m||j>=n){
               return Integer.MAX_VALUE;
           }
           int ans1;
           int ans2;
           int ans3;
           if(dp[i+1][j]==Integer.MIN_VALUE){
               ans1=minCostPath(input, i+1, j);
               dp[i+1][j]=ans1;
           }else{
               ans1=dp[i+1][j];
           }
           if(dp[i][j+1]==Integer.MIN_VALUE){
               ans2=minCostPath(input, i, j+1);
               dp[i][j+1]=ans2;
           }else{
               ans2=dp[i][j+1];
           }
           if(dp[i+1][j+1]==Integer.MIN_VALUE){
               ans3=minCostPath(input, i+1, j+1);
               dp[i+1][j+1]=ans3;
           }else{
               ans3=dp[i+1][j+1];
           }
           int myans=input[i][j]+Math.min(ans1, Math.min(ans2,ans3));
           return myans;
       }
       public static int mincostIterative(int input[][]){
           int m=input.length;
           int n=input[0].length;
           int dp[][]=new int[m+1][n+1];
           for(int i=0;i<m;i++){
               for(int j=0;j<n;j++){
                   dp[i][j]=Integer.MAX_VALUE;  
               }
           }
           for(int i=m-1;i>=0;i--){
               for(int j=n-1;j>=0;j--){
                   if(i==m-1&& j==n-1){
                       dp[i][j]=input[i][j];
                       continue;
                   }
                   
                   int ans1=dp[i][j+1];
                   int ans2=dp[i+1][j];
                   int ans3=dp[i+1][j+1];
                   dp[i][j]=input[i][j]+Math.min(ans1,Math.min(ans2,ans3)); 
               }
           }
           return dp[0][0];
           
                   
                   }

    
    public static void main(String[] args){
        int cost[][]={{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
//        int ans=minCostPath(cost,0,0);
//        System.out.println(ans);

// memoization..
int m=cost.length;
int n=cost[0].length;
int dp[][]=new int[m+1][n+1];
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        dp[i][j]=Integer.MIN_VALUE;
    }
    
}
int ans=minCostPathMEMOIZATION(cost,0,0,dp);
        System.out.println(ans);
        
        //  iterative..
        int ansI=mincostIterative(cost);
        System.out.println(ansI);
    }
}
